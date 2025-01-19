package com.telran.prof.lessontwo.factory;

public class AdministrationWorker extends Worker {

    @Override
    public void printInfo() {
        super.printInfo(); // super - вызов метода из класса родителя
        System.out.println("I do administration function");
    }
}