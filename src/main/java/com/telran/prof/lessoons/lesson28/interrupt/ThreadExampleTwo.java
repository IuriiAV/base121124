package com.telran.prof.lessoons.lesson28.interrupt;

public class ThreadExampleTwo implements Runnable{
    @Override
    public void run() {
        while (true) {
            if(Thread.currentThread().isInterrupted()) {
                System.out.println("Get interrupt command");
                break;
            }
        }
    }
}
