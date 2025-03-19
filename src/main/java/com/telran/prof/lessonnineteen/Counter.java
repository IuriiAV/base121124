package com.telran.prof.lessonnineteen;

public class Counter {

    public static int count = 0;

    public static void main(String[] args) throws Exception {
        Incrementor incrementor = new Incrementor();
        Thread thread = new Thread(incrementor);
        thread.start();

        Thread thread1 = new Thread(incrementor);
        thread1.start();

        thread.join();
        thread1.join();
        System.out.println(count);
    }
}
