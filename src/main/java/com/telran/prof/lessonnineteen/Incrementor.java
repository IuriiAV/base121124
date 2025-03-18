package com.telran.prof.lessonnineteen;

public class Incrementor implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            synchronized (this) {
                Counter.count++;
            }// 1) Read value, 2) Increment value, 3) Write value
            // System.out.println(Counter.count);
            // count = 94
            //Thread 1 = 1) 94; 2) 95
            //Thread 2 = 1) 94; 2) 95
            //Thread 1 3) 95
            //Thread 2 3) 95

//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
