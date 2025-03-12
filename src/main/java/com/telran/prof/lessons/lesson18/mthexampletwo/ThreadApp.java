package com.telran.prof.lessons.lesson18.mthexampletwo;

public class ThreadApp {

    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();

        new Thread(threadExample).start();


    }
}
