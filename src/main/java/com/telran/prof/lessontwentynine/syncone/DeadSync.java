package com.telran.prof.lessontwentynine.syncone;

public class DeadSync implements Runnable {

    private boolean flag = false;

    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName() + " start run");

        while (true) {
            if (flag) {
                break;
            }
        }
        System.out.println(Thread.currentThread().getName() + " start end");

    }
}
