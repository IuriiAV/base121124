package com.telran.prof.lessoneighteen.mthexampletwo;

public class ThreadExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Current thread name is " + Thread.currentThread().getName());
    }
}
