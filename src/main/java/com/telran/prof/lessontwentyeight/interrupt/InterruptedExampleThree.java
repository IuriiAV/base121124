package com.telran.prof.lessontwentyeight.interrupt;

public class InterruptedExampleThree {

    public static void main(String[] args) throws Exception{
        ThreadExampleThree threadExampleThree = new ThreadExampleThree();
        Thread thread = new Thread(threadExampleThree);
        thread.start();

        for (int i = 0 ; i < 10000; i++) {
            Thread.sleep(1);
            thread.interrupt();
        }

    }
}
