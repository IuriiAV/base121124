package com.telran.prof.lessoons.hw.hw15.taskone;

public class ThreadExample implements Runnable {

    private final int[] array;

    private final int target;

    private final int startIndex;

    private final int endIndex;

    private static volatile boolean flag = false;

    public ThreadExample(int[] array, int target, int startIndex, int endIndex) {
        this.array = array;
        this.target = target;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < endIndex; i++) {
            if (flag) {
                return;
            }
            if (array[i] == target) {
                System.out.println(Thread.currentThread().getName() + " found " + target + " at index " + i);
                flag = true;
                return;
            }
        }

    }
}