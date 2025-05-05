package com.telran.prof.lessoons.lesson29.syncone;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest implements Runnable {

    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        boolean result = lock.tryLock();
        if (result) {
            System.out.println(Thread.currentThread().getName() + " start run");
            try {
                for (int i = 0; i < 100; i++) {
                    DeadApp.counter++;
                    pause(30);
                }
//                if (Thread.currentThread().getName().contains("0")) {
//                    throw new UnsupportedOperationException();
//                }
                System.out.println(Thread.currentThread().getName() + " stop run");
            } finally {
                lock.unlock();
            }
        }
        pause(10);
    }

    private void pause(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
