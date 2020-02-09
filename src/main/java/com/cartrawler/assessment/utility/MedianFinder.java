package com.cartrawler.assessment.utility;

import com.cartrawler.assessment.car.CarResult;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MedianFinder {

    PriorityQueue<Double> minHeap = null;
    PriorityQueue<Double> maxHeap = null;

    public MedianFinder(){
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(double num){
        minHeap.offer(num);
        maxHeap.offer(minHeap.poll());

        if(minHeap.size()<maxHeap.size()){
            minHeap.offer(maxHeap.poll());
        }
    }

    public double findMedian() {
        if(minHeap.size() > maxHeap.size()){
            return minHeap.peek();
        }else {
            return (minHeap.peek()+maxHeap.peek())/2.0;
        }
    }

    public  double findMedianOfSortedArray(List<CarResult> array){
        int length = array.size();
        if(length%2 !=0) {
            return  array.get(length / 2).getRentalCost();
        }

        return (array.get((length-1)/2).getRentalCost() + array.get(length/2).getRentalCost())/2;

    }
}
