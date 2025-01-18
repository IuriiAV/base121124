package com.telran.prof.lessoons.lesson2.factory;

public class AdminWorker extends Worker{

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("I do administration functions");
    }
}
