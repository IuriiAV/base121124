package com.telran.prof.lessontwentynine.syncone;

public class DeadApp {

    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        //DeadSync deadSync = new DeadSync();

        LockTest lockTest = new LockTest();
        Thread thread = new Thread(lockTest);
        thread.start();
        Thread.sleep(50);
        Thread thread1 = new Thread(lockTest);
        thread1.start();

        Thread.sleep(1000);
        System.out.println(thread.getName() + " " + thread.getState());
        System.out.println(thread1.getName() + " " + thread1.getState());

        Thread.sleep(10000);
        System.out.println(thread.getName() + " " + thread.getState());
        System.out.println(thread1.getName() + " " + thread1.getState());

        thread.join();
        thread1.join();

        System.out.println("Counter " + counter);
    }
}
