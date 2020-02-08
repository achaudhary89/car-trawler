package com.cartrawler.assessment.worker;

import com.cartrawler.assessment.car.CarResult;
import com.cartrawler.assessment.comparator.PriceComparator;
import com.cartrawler.assessment.constants.CarGroupEnum;

import java.util.*;
import java.util.concurrent.Callable;

public class CarPriceSortingWorker implements Callable<Map<CarGroupEnum,List<CarResult>>> {

    private Map<CarGroupEnum,List<CarResult>> carResultsMap  =   null;
    private CarGroupEnum carGroupEnum =   null;
    private Map<CarGroupEnum, List<CarResult>>  resultMap = null;

    public CarPriceSortingWorker(Map<CarGroupEnum,List<CarResult>> carResultsMap, CarGroupEnum carGroupEnum) {
        this.carResultsMap = carResultsMap;
        this.carGroupEnum = carGroupEnum;
        this.resultMap = new HashMap<>();
    }

    @Override
    public Map<CarGroupEnum, List<CarResult>> call() throws Exception {
        List<CarResult> carResults  =   carResultsMap.get(carGroupEnum);
        Collections.sort(carResults, PriceComparator.getPriceComparator());
        resultMap.put(carGroupEnum, carResults);
        return resultMap;
    }
}
