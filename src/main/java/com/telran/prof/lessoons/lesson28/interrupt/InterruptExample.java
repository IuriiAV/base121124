package com.telran.prof.lessoons.lesson28.interrupt;

public class InterruptExample {

    public static void main(String[] args) throws Exception {
        ThreadExample threadExample = new ThreadExample();
        Thread thread = new Thread(threadExample);
        System.out.println("State after create is " + thread.getState());

        thread.start();
        System.out.println("State after start is " + thread.getState());

        Thread.sleep(1000);
        System.out.println("State after during sleep is " + thread.getState());
        thread.interrupt(); //если поток спит, вызов этой команды приведет
        // к выбросу InterruptedException

        //thread.join();
        System.out.println("State after end is " + thread.getState());
    }
}
