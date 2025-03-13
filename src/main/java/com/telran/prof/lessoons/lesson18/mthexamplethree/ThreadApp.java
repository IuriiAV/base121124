package com.telran.prof.lessoons.lesson18.mthexamplethree;

public class ThreadApp {

    // Start program
    // Create main thread
        // run method main
        // print Start method main
    // create other thread
        // print End method main
        // finish method main
    // Finish main thread
    // End program (Process finished with exit code 0)

    public static void main(String[] args) {
        System.out.println("Start method main in thread " + Thread.currentThread().getName());

        new Thread(new ThreadExample()).start();

        System.out.println("End method main in thread " + Thread.currentThread().getName());
    }
}
