package com.cartrawler.assessment.comparator;

import com.cartrawler.assessment.car.CarResult;

import java.util.Comparator;

public class CorporateComparator implements Comparator<CarResult> {


    @Override
    public int compare(CarResult o1, CarResult o2) {
        return o2.isCorporate().compareTo(o1.isCorporate());
    }

}
