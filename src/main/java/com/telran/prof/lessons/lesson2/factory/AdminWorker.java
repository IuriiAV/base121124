package com.telran.prof.lessons.lesson2.factory;

public class AdminWorker extends Worker {

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("I do administration function");
    }
}
