package com.cartrawler.assessment.utility;

import com.cartrawler.assessment.car.CarResult;

import java.util.List;
import java.util.concurrent.ExecutorService;

public class CarTrawlerUtility {

    private static final int NUMBER_OF_THREADS = 4;

    public static void shutDownExecutorService(ExecutorService executorService){
        executorService.shutdown();
    }

    public static int getNumberOfThreads(){
        return  NUMBER_OF_THREADS;
    }

    public static double findMedianOfSortedArray(List<CarResult> array){
        int length = array.size();
        if(length%2 !=0) {
            return  array.get(length / 2).getRentalCost();
        }

        return (array.get((length-1)/2).getRentalCost() + array.get(length/2).getRentalCost())/2;

    }
}
