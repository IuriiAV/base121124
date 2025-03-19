package com.telran.prof.lessoneighteen.mthexampleone;

public class ThreadExample extends Thread {

    @Override
    public void run() {
        System.out.println("Thread name is " + Thread.currentThread().getName());
    }
}
