package com.telran.prof.lessoons.hw.hw15.taskone;

public class LinearSearch {

    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int target = 76442;

        Thread thread = new Thread(new ThreadExample(array, target, 0, 25000));
        Thread threadTwo = new Thread(new ThreadExample(array, target, 25000, 50000));
        Thread threadThree = new Thread(new ThreadExample(array, target, 50000, 75000));
        Thread threadFour = new Thread(new ThreadExample(array, target, 75000, 100000));

        long start = System.currentTimeMillis();

        thread.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();

        thread.join();
        threadTwo.join();
        threadThree.join();
        threadFour.join();

        long end = System.currentTimeMillis();
        System.out.print("It takes " + (end - start));

    }
}
