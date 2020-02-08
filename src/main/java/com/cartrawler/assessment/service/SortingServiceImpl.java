package com.cartrawler.assessment.service;

import com.cartrawler.assessment.car.CarResult;
import com.cartrawler.assessment.constants.CarGroupEnum;
import com.cartrawler.assessment.constants.CarSuppliersEnum;
import com.cartrawler.assessment.utility.CarTrawlerUtility;
import com.cartrawler.assessment.worker.SIPPCodeSortingWorker;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SortingServiceImpl implements SortingService {

    @Override
    public Set<CarResult> sort(Set<CarResult> carResults) {
        List<CarResult> corporateCars = new ArrayList<>();
        List<CarResult> nonCorporateCars = new ArrayList<>();
        Set<CarResult> sortedResults = new LinkedHashSet<>();
        for (CarResult carResult : carResults) {
            if (CarSuppliersEnum.CAR_SUPPLIERS_ENUMS.contains(CarSuppliersEnum.valueOf(carResult.getSupplierName()))) {
                corporateCars.add(carResult);
            } else {
                nonCorporateCars.add(carResult);
            }
        }

        SIPPCodeSortingWorker corporateCarSortingWorker = new SIPPCodeSortingWorker(corporateCars);
        SIPPCodeSortingWorker nonCorporateCarSortingWorker = new SIPPCodeSortingWorker(nonCorporateCars);
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<List<Future>> sortedCorporateCarsFuture = service.submit(corporateCarSortingWorker);
        Future<List<Future>> sortedNonCorporateCarsFuture = service.submit(nonCorporateCarSortingWorker);
        populateDataFromFuture(sortedCorporateCarsFuture,sortedResults);
        populateDataFromFuture(sortedNonCorporateCarsFuture,sortedResults);
        CarTrawlerUtility.shutDownExecutorService(service);
        return sortedResults;
    }

    private Set<CarResult> populateDataFromFuture(Future<List<Future>> future, Set<CarResult> sortedResults){
        try {
            List<Future> futureList    =   future.get();
            for(Future future1 : futureList){
                Map<CarGroupEnum, List<CarResult>> carGroupEnumListMap = (Map<CarGroupEnum, List<CarResult>>) future1.get();

                for(CarGroupEnum carGroupEnum : CarGroupEnum.values()){
                    if(carGroupEnumListMap.containsKey(carGroupEnum)){
                        sortedResults.addAll(carGroupEnumListMap.get(carGroupEnum));
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return sortedResults;
    }
}
