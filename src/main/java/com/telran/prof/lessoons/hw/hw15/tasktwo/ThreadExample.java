package com.telran.prof.lessoons.hw.hw15.tasktwo;

import java.util.concurrent.Callable;

public class ThreadExample implements Callable<Integer> {

    private final int[] array;

    private final int startIndex;

    private final int endIndex;

    public ThreadExample(int[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            sum+= array[i];
        }
        return sum;
    }
}
