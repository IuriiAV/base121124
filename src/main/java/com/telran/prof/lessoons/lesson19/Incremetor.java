package com.telran.prof.lessoons.lesson19;

public class Incremetor implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (this) { //любая синхронизация потоков уменьшает производительность
                Counter.count++;
            //1) Read value, 2) Increment value, 3) Write value
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
