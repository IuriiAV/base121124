package com.telran.prof.lessons.lesson18.sumarray;

public class Summator implements Runnable{

    private int[] array;

    private int start;

    private int end;

    public Summator(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public void printSum(){
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum = sum + array[i];
        }

        System.out.println("Sum in single thread " + sum);
    }

    @Override
    public void run() {
        printSum();
    }
}
