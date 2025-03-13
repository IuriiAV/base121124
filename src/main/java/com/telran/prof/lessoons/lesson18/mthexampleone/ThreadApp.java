package com.telran.prof.lessoons.lesson18.mthexampleone;

public class ThreadApp {

    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();

        //запуск в главном потоке
        threadExample.run();

        //запуск в новом потоке
        Thread threadOne = new Thread(threadExample);
        threadOne.start();

        Thread threadTwo = new Thread(threadExample);
        threadTwo.start();

        Thread threadThree = new Thread(threadExample);
        threadThree.start();

        for (int i = 0; i < 10; i++) {
            new Thread(threadExample).start();
        }
    }
}
