package com.cartrawler.assessment.comparator;

import com.cartrawler.assessment.car.CarResult;

import java.util.Comparator;

public class PriceComparator  {

    public static Comparator<CarResult> getPriceComparator() {
       return  Comparator.comparingDouble(CarResult::getRentalCost);
    }
}
