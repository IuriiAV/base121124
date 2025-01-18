package com.telran.prof.lessoons.lesson3.workerExampe;

public class AdminWorker extends Worker {

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("I do administration functions");
    }

    public void printGreetings() {
        System.out.println("Greetings");
    }
}
