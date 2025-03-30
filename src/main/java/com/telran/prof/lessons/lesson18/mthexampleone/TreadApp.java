package com.telran.prof.lessons.lesson18.mthexampleone;

public class TreadApp {

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

        for (int i = 0; i < 100; i++) {
            new Thread(threadExample).start();
        }
    }
}
