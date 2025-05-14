package com.telran.prof.lessons.lesson2.factory;

public class TechWorker extends Worker{

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("I do tech function");
    }
}
