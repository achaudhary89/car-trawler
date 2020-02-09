package com.cartrawler.assessment.service;

import com.cartrawler.assessment.car.CarResult;
import com.cartrawler.assessment.comparator.CorporateComparator;
import com.cartrawler.assessment.comparator.PriceComparator;
import com.cartrawler.assessment.comparator.SIPPCodeComparator;
import com.cartrawler.assessment.constants.CarGroupEnum;
import com.cartrawler.assessment.utility.CarTrawlerUtility;

import java.util.*;

public class SimpleSortingServiceImpl implements SortingService {

    private Map<CarGroupEnum, List<CarResult>> carGroupMap    =   null;
    private Set<CarResult> results = new LinkedHashSet<>();

    public SimpleSortingServiceImpl() {
        this.carGroupMap = new HashMap<>();
    }

    @Override
    public Set<CarResult> sort(Set<CarResult> carResult) {
        List<CarResult> list    =   new ArrayList<>(carResult);
        List<CarResult> corporateList   =   null;
        List<CarResult> nonCorporateList =  null;
        int lastIndexOfCorporate = 0;
        Collections.sort(list, new CorporateComparator());
        for(CarResult result : list){
            if(result.isCorporate()){
                lastIndexOfCorporate++;
            }else{
                break;
            }

        }
        corporateList = list.subList(0,++lastIndexOfCorporate);
        nonCorporateList = list.subList(lastIndexOfCorporate, list.size());
        Collections.sort(corporateList, new SIPPCodeComparator());
        Collections.sort(nonCorporateList, new SIPPCodeComparator());
        Map<CarGroupEnum, List<CarResult>> corporateCarGroupMap = populateMap(corporateList);
        Map<CarGroupEnum, List<CarResult>> nonCorporateCarGroupMap = populateMap(nonCorporateList);
        populateResultSet(corporateCarGroupMap);
        populateResultSet(nonCorporateCarGroupMap);

         return results;
    }

    private Map populateMap(List<CarResult> list){
        Map<CarGroupEnum, List<CarResult>> carGroupMap = new HashMap<>();
        for (CarResult carResult : list){
            carGroupMap.putIfAbsent(carResult.getCarGroupEnum(), new ArrayList<CarResult>());
            carGroupMap.get(carResult.getCarGroupEnum()).add(carResult);
        }
        return carGroupMap;
    }

    private void populateResultSet(Map<CarGroupEnum, List<CarResult>> carGroupMap){
        for(CarGroupEnum carGroup : CarGroupEnum.values()){
            List<CarResult> groupWiseList   =   carGroupMap.get(carGroup);
            Collections.sort(groupWiseList, PriceComparator.getPriceComparator());
            double median = CarTrawlerUtility.findMedianOfSortedArray(groupWiseList);
            groupWiseList.removeIf(e->e.getRentalCost() > median);
            results.addAll(groupWiseList);
        }
    }
}
