package com.telran.prof.lessoons.lesson18;

public class Printer extends Thread{

    @Override
    public void run() {
        int count = 0;
        String name = Thread.currentThread().getName();
        while (true) {
            System.out.println("Hello from " + name + " , count = " + count++);

            //Pause in current Thread
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Pause in current Thread
        }
    }
}
