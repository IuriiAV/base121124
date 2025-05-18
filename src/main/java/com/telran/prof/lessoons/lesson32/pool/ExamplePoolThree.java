package com.telran.prof.lessoons.lesson32.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExamplePoolThree {

    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newCachedThreadPool();

        Thread.sleep(30000);

        for (int i = 0; i < 100000; i++) {
            executorService.submit(new Calculator(i));
        }

        Thread.sleep(100000);
        //executorService.shutdown();
    }
}
