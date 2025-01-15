package com.telran.prof.lessontwo.factory;

public class FactoryApp {

    public static void main(String[] args) {
        Worker workerOne = new Worker();
        workerOne.printInfo();

        Worker workerTwo = new Worker();

        System.out.println();

        AdministrationWorker administrationWorker = new AdministrationWorker();
        administrationWorker.printInfo();

        System.out.println();

        TechWorker techWorker = new TechWorker();
        techWorker.printInfo();

        //Worker -> Worker, AdministrationWorker, TechWorker

        System.out.println("Array of workers : ");
        Worker[] workers = {workerOne, workerTwo, administrationWorker, techWorker};
        for (int i = 0; i < workers.length; i++) {
            workers[i].printInfo();
            System.out.println();
        }
    }
}
