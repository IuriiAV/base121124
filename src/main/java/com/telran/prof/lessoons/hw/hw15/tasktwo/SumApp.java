package com.telran.prof.lessoons.hw.hw15.tasktwo;

import java.util.concurrent.FutureTask;

public class SumApp {

    public static void main(String[] args) throws Exception{
        int[] array = new int[100000];
        int controlSum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            controlSum+=i;
        }

        FutureTask<Integer> taskOne = new FutureTask<>(new ThreadExample(array, 0, 50000));
        FutureTask<Integer> taskTwo = new FutureTask<>(new ThreadExample(array, 50000, 100000));

        long start = System.currentTimeMillis();

        new Thread(taskOne).start();
        new Thread(taskTwo).start();

        Integer resOne = taskOne.get();
        Integer resTwo = taskTwo.get();

        long end  = System.currentTimeMillis();
        System.out.println("Total sum is " + (resOne + resTwo));
        System.out.println("Control sum is " + controlSum);
        System.out.println("It takes " + (end - start));
    }
}
