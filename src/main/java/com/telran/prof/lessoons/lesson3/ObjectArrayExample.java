package com.telran.prof.lessoons.lesson3;

import com.telran.prof.lessoons.lesson2.factory.AdminWorker;
import com.telran.prof.lessoons.lesson2.factory.TechWorker;
import com.telran.prof.lessoons.lesson2.factory.Worker;

public class ObjectArrayExample {

    public static void main(String[] args) {
        Object[] objects = {"String", 30, new Car()};

        for (int i = 0; i < objects.length; i++) {
            Object object = objects[i];
            System.out.println(object);
        }

            Worker[] workers = {new Worker(), new AdminWorker(), new TechWorker()};

//            for (int i = 0; i < workers.length; i++) {
//                Worker worker = workers[i];
//                if (worker instanceof AdminWorker) {
//                    AdminWorker adminWorker = (AdminWorker) worker;
//                    adminWorker.printGreetings();
//                }
//                System.out.println(worker);
//            }
        }
    }
