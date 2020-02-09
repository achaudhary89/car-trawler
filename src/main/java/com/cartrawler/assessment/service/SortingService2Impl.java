package com.cartrawler.assessment.service;

import com.cartrawler.assessment.car.CarResult;
import com.cartrawler.assessment.comparator.PriceComparator;
import com.cartrawler.assessment.constants.CarGroupEnum;
import com.cartrawler.assessment.constants.SupplierTypeEnum;
import com.cartrawler.assessment.utility.CarTrawlerUtility;

import java.util.*;

public class SortingService2Impl implements SortingService {

    private Map<SupplierTypeEnum, Map<CarGroupEnum, Queue<CarResult>>> carResultsMap = null;

    private Map<CarGroupEnum, Queue<CarResult>> groupSortedMap = null;

    private Queue<CarResult> carResultsQueue = null;

    private Set<CarResult> results = null;

    public SortingService2Impl() {
        this.carResultsMap = new HashMap<>();
        this.results = new LinkedHashSet<>();
    }

    @Override
    public Set<CarResult> sort(Set<CarResult> carResults) {
        for(CarResult carResult : carResults){
                buildCarResultMap(carResult);
        }
        populateResultSet(carResultsMap.get(SupplierTypeEnum.COPORATE));
        populateResultSet(carResultsMap.get(SupplierTypeEnum.NON_CORPORATE));
        return results;
    }

    private void buildCarResultMap(CarResult carResult) {
        if(carResult.isCorporate()){
            populateCarResultMap(carResult, SupplierTypeEnum.COPORATE);
        }else{
            populateCarResultMap(carResult, SupplierTypeEnum.NON_CORPORATE);
        }

    }



    private void populateCarResultMap(CarResult carResult, SupplierTypeEnum supplierTypeEnum){
        Map<CarGroupEnum, Queue<CarResult>> map =   carResultsMap.getOrDefault(supplierTypeEnum, new HashMap<CarGroupEnum, Queue<CarResult>>());
        Queue<CarResult> queue = map.getOrDefault(carResult.getCarGroupEnum(),new PriorityQueue<CarResult>(PriceComparator.getPriceComparator()));
        queue.add(carResult);
        map.put(carResult.getCarGroupEnum(),queue);
        carResultsMap.put(supplierTypeEnum,map);
    }

    private void populateResultSet(Map<CarGroupEnum, Queue<CarResult>> map){
        for(CarGroupEnum carGroup : CarGroupEnum.values()){
            Queue<CarResult> groupWiseQueue   =   map.get(carGroup);
           /* double median = CarTrawlerUtility.findMedianOfSortedArray(groupWiseQueue);
            groupWiseList.removeIf(e->e.getRentalCost() > median);*/
            results.addAll(groupWiseQueue);
        }
        long end = System.currentTimeMillis();
    }

}
