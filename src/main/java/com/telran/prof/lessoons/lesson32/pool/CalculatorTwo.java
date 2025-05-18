package com.telran.prof.lessoons.lesson32.pool;

import java.util.concurrent.Callable;

public class CalculatorTwo implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("Start thread " + Thread.currentThread().getName());
        Thread.sleep(2000);
        System.out.println("Stop thread " + Thread.currentThread().getName());
        return "Hello";
    }
}
