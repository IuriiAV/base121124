package com.telran.prof.lessoons.lesson28.interrupt;

public class InterruptedExampleTwo {

    public static void main(String[] args) throws Exception {
        ThreadExampleTwo threadExampleTwo = new ThreadExampleTwo();
        Thread thread = new Thread(threadExampleTwo);
        System.out.println("State after create is " + thread.getState());

        thread.start();
        System.out.println("State after start is " + thread.getState());


        System.out.println("Before interrupt is " + thread.isInterrupted());

        Thread.sleep(1000);
        System.out.println("State after during is " + thread.getState());
        thread.interrupt(); //если поток спит, вызов этой команды приведет
        // к выбросу InterruptedException
        System.out.println("After first interrupt attempt " + thread.isInterrupted());

        Thread.sleep(1000);
        System.out.println("State after during is " + thread.getState());
        thread.interrupt();
        System.out.println("After second interrupt attempt " + thread.isInterrupted());

        Thread.sleep(1000);
        System.out.println("State after during work is " + thread.getState());
        thread.interrupt();
        System.out.println("After third interrupt attempt " + thread.isInterrupted());

        //thread.join();
        System.out.println("State after end is " + thread.getState());
    }
}
