package com.telran.prof.lessoons.lesson32.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExamplePoolTwo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 12; i++) {
            executorService.submit(new Calculator(i));
        }

        executorService.shutdown();
    }
}
