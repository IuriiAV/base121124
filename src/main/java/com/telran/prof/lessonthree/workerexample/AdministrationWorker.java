package com.telran.prof.lessonthree.workerexample;

public class AdministrationWorker extends Worker {

    @Override
    public void printInfo() {
        super.printInfo(); // super - вызов метода из класса родителя
        System.out.println("I do administration function");
    }

    public void printGreetings() {
        System.out.println("Greetings");
    }
}