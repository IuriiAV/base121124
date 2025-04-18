package com.telran.prof.lessontwentyeight.interrupt;

public class ThreadExampleTwo implements Runnable {

    @Override
    public void run() {
        while (true) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Get interrupt command");
                break;
            }
        }
    }
}
