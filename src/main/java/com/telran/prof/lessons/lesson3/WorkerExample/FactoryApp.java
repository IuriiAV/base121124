package com.telran.prof.lessons.lesson3.WorkerExample;

public class FactoryApp {

    public static void main(String[] args) {
        Worker workerOne = new Worker();
        workerOne.printInfo();

        Worker workerTwo = new Worker();

        System.out.println();

        AdminWorker adminWorker = new AdminWorker();
        adminWorker.printInfo();

        System.out.println();

        TechWorker techWorker = new TechWorker();
        techWorker.printInfo();

        Worker[] workers = {workerOne, workerTwo, adminWorker, techWorker};
        for (int i = 0; i < workers.length; i++) {
            workers[i].printInfo();
        }
    }
}
