package com.telran.prof.lessoons.lesson28.task;

import java.util.Random;

public class TaskApp {

    public static boolean isEnable = true;

    public static void main(String[] args) {
        Thread threadOne = new Thread(new Counter(new Random().nextInt(0, 11)));
        Thread threadTwo = new Thread(new Counter(new Random().nextInt(0, 11)));
        Thread threadThree = new Thread(new Counter(new Random().nextInt(0, 11)));

        threadOne.setName("Thread-One");
        threadTwo.setName("Thread-Two");
        threadThree.setName("Thread-Three");

        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}
