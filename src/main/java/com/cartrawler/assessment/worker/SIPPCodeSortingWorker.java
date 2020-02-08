package com.cartrawler.assessment.worker;

import com.cartrawler.assessment.car.CarResult;
import com.cartrawler.assessment.comparator.SIPPCodeComparator;
import com.cartrawler.assessment.constants.CarGroupEnum;
import com.cartrawler.assessment.utility.CarTrawlerUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;


public class SIPPCodeSortingWorker implements Callable<List<Future>> {

    private List<CarResult> carResults   =   null;

    private Map<CarGroupEnum, List<CarResult>> carGroupMap    =   null;

    private List<Future> futureList = null;


    public SIPPCodeSortingWorker(List<CarResult> carResults) {
        this.carResults = carResults;
        this.carGroupMap    =   new ConcurrentHashMap<>();
        this.futureList = new ArrayList<>();
    }

    @Override
    public List<Future> call() throws Exception {
        Collections.sort(carResults, new SIPPCodeComparator());
        ExecutorService service  = Executors.newFixedThreadPool(CarTrawlerUtility.getNumberOfThreads());
        populateMap();
        for(CarGroupEnum carGroup : carGroupMap.keySet()){
           Future future =  service.submit(new CarPriceSortingWorker(carGroupMap, carGroup));
           futureList.add(future);
        }
        CarTrawlerUtility.shutDownExecutorService(service);
        return futureList;
    }

    private void populateMap(){
        for (CarResult carResult : carResults){
            carGroupMap.putIfAbsent(carResult.getCarGroupEnum(), new ArrayList<CarResult>());
            carGroupMap.get(carResult.getCarGroupEnum()).add(carResult);
        }

    }
}
