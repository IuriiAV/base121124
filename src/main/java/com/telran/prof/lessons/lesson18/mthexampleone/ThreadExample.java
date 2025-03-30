package com.telran.prof.lessons.lesson18.mthexampleone;

public class ThreadExample extends Thread{

    @Override
    public void run(){
        System.out.println("Thread name is " + Thread.currentThread().getName());
    }

}
