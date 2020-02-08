package com.cartrawler.assessment.utility;

import java.util.concurrent.ExecutorService;

public class CarTrawlerUtility {

    private static final int NUMBER_OF_THREADS = 4;

    public static void shutDownExecutorService(ExecutorService executorService){
        executorService.shutdown();
    }

    public static int getNumberOfThreads(){
        return  NUMBER_OF_THREADS;
    }
}
