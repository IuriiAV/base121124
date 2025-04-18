package com.telran.prof.lessoons.lesson28.interrupt;

public class InterruptedExampleThree {

    public static void main(String[] args) throws Exception{
        ThreadExampleThree threadExampleThree = new ThreadExampleThree();
        Thread thread = new Thread(threadExampleThree);
        thread.start();

        for (int i = 0; i < 10000; i++) {
            Thread.sleep(3);
            thread.interrupt();
        }
    }
}
