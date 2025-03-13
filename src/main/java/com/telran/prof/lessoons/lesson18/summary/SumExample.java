package com.telran.prof.lessoons.lesson18.summary;

import java.util.Random;

public class SumExample {

    public static void main(String[] args) throws Exception{
        int[] array = new int[300000000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,100);
        }

        Summator summator = new Summator(array, 0, array.length);
        long start = System.currentTimeMillis();
        //summator.printSum();
        long end = System.currentTimeMillis();

        System.out.println("It takes : " + (end - start));

        Summator one = new Summator(array, 0, 150000000);
        Summator two = new Summator(array, 150000000, 300000000);
//        Summator three = new Summator(array, 150000000, 225000000);
//        Summator four = new Summator(array, 225000000, 300000000);
        Thread threadOne = new Thread(one);
        Thread threadTwo = new Thread(two);
//        Thread threadThree = new Thread(three);
//        Thread threadFour = new Thread(four);


        start = System.currentTimeMillis();

        threadOne.start();
        threadTwo.start();
//        threadThree.start();
//        threadFour.start();

        threadOne.join();
        threadTwo.join();
//        threadThree.join();
//        threadFour.join();

        end = System.currentTimeMillis();
        System.out.println("It takes : " + (end - start));
    }
}
