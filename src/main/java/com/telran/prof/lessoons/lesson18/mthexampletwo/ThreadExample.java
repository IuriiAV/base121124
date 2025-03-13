package com.telran.prof.lessoons.lesson18.mthexampletwo;

public class ThreadExample implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread name is " + Thread.currentThread().getName());
    }
}
