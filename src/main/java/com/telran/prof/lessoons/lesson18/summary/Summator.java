package com.telran.prof.lessoons.lesson18.summary;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Summator implements Runnable {

    private int[] array;

    private int start;

    private int end;

    public void printSum() {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }

        System.out.println("Sum in single thread " + sum);
    }

    @Override
    public void run() {
        printSum();
    }
}
