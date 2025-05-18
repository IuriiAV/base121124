package com.telran.prof.lessoons.lesson31.arraysumtwo;

import com.telran.prof.lessoons.lesson31.arraysum.Result;

import java.util.concurrent.Callable;

public class ArraySummarizer implements Callable<Integer> {

    private final int[] array;

    private final int start;

    private final int end;

    public ArraySummarizer(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
