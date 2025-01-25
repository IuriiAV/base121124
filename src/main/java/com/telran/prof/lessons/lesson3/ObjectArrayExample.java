package com.telran.prof.lessons.lesson3;

import com.telran.prof.lessons.lesson2.factory.AdminWorker;
import com.telran.prof.lessons.lesson2.factory.TechWorker;
import com.telran.prof.lessons.lesson2.factory.Worker;

public class ObjectArrayExample {

    public static void main(String[] args) {
        Object[] objects = {"Hello", 5, new Car()};
        for (int i = 0; i < objects.length; i++) {
            Object object = objects[i];
        }

        Worker[] workers = {new Worker(), new AdminWorker(), new TechWorker()};
        for (int i = 0; i < workers.length; i++) {
            Worker worker = workers[i];
            if(worker instanceof AdminWorker){
                AdminWorker adminWorker = (AdminWorker) worker;
                adminWorker.printInfo();
            }
        }
    }
}
