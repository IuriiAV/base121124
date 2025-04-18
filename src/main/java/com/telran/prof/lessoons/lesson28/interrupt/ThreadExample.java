package com.telran.prof.lessoons.lesson28.interrupt;

public class ThreadExample implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Command to interrupt received");
                break;
            }
        }
    }
}
