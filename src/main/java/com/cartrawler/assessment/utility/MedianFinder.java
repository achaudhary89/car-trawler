package com.cartrawler.assessment.utility;

import java.util.Comparator;
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
}
