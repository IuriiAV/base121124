package com.telran.prof.lessoons.lesson19;

public class Counter {

    public static int count = 0;

    public static void main(String[] args) throws Exception{
        Incremetor incremetor = new Incremetor();
        Thread thread = new Thread(incremetor);
        thread.start();

        Thread thread1 = new Thread(incremetor);
        thread1.start();

        thread.join();
        thread1.join();
        System.out.println(count);
    }
}
