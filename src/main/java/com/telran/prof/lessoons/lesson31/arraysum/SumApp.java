package com.telran.prof.lessoons.lesson31.arraysum;

import java.util.Random;

public class SumApp {

    public static int resultSum = 0;

    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[100_000_000];
        Random random = new Random();
        int controlSum = 0;
        for (int i = 0; i < array.length; i++) {
            int value = random.nextInt(1, 5);
            array[i] = value;
            controlSum += value;
        }

        //int[] result = new int[2];

        Result resultTwo = new Result();
        Thread one = new Thread(new ArraySummarizer(array, 0, 50_000_000, resultTwo));
        Thread two = new Thread(new ArraySummarizer(array, 50_000_000, 100_000_000, resultTwo));

        long startTime = System.currentTimeMillis();

        one.start();
        two.start();

        one.join();
        two.join();

        long endTime = System.currentTimeMillis();

        //int total = result[0] + result[1];

        System.out.println("Control sum = " + controlSum);
        System.out.println("Sum = " + resultTwo.getResult() + " it takes " + (endTime - startTime));
    }
}
