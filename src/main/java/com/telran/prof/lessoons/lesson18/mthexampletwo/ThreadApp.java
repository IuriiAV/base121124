package com.telran.prof.lessoons.lesson18.mthexampletwo;

public class ThreadApp {

    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();
        threadExample.run();
        new Thread(threadExample).start();
    }
}
