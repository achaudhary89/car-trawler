package com.cartrawler.assessment.service;

import com.cartrawler.assessment.car.CarResult;
import com.cartrawler.assessment.comparator.PriceComparator;
import com.cartrawler.assessment.enums.CarGroupEnum;
import com.cartrawler.assessment.enums.SupplierTypeEnum;
import com.cartrawler.assessment.utility.MedianFinder;

import javax.print.attribute.standard.Media;
import java.util.*;

public class SortingServiceImpl implements SortingService {

    private Map<SupplierTypeEnum, Map<CarGroupEnum, List<CarResult>>> carResultsMap = null;

    private Set<CarResult> results = null;

    private MedianFinder medianFinder = null;


    public SortingServiceImpl() {
        this.carResultsMap = new HashMap<>();
        this.results = new LinkedHashSet<>();
        this.medianFinder = new MedianFinder();
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
        Map<CarGroupEnum, List<CarResult>> map =   carResultsMap.getOrDefault(supplierTypeEnum, new HashMap<CarGroupEnum, List<CarResult>>());
        List<CarResult> list = map.getOrDefault(carResult.getCarGroupEnum(),new ArrayList<CarResult>());
        list.add(carResult);
        map.put(carResult.getCarGroupEnum(),list);
        carResultsMap.put(supplierTypeEnum,map);
    }

    private void populateResultSet(Map<CarGroupEnum, List<CarResult>> map){
        if(map == null){
            return;
        }
        for(CarGroupEnum carGroup : CarGroupEnum.values()){
            List<CarResult> groupWiseList   =   map.get(carGroup);
            if(groupWiseList != null) {
                Collections.sort(groupWiseList, PriceComparator.getPriceComparator());
                double median = medianFinder.findMedianOfSortedArray(groupWiseList);
                groupWiseList.removeIf(e -> e.getRentalCost() > median);
                results.addAll(groupWiseList);
            }
        }
    }

}
