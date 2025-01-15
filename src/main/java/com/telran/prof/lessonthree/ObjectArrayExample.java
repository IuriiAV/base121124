package com.telran.prof.lessonthree;

import com.telran.prof.lessonthree.workerexample.AdministrationWorker;
import com.telran.prof.lessonthree.workerexample.TechWorker;
import com.telran.prof.lessonthree.workerexample.Worker;

public class ObjectArrayExample {

    public static void main(String[] args) {
        Object[] objects = {"Hello", 5, new Car()};
        for (int i = 0; i < objects.length; i++) {
            //Type Object = String,Int,Car etc
            Object object = objects[i];
        }

        Worker[] workers = {new Worker(), new AdministrationWorker(), new TechWorker()};

        //Worker имеет только методы класса Worker
        //AdministrationWorker имеет методы класса AdministrationWorker + методы класса Worker
        //TechWorker имеет методы класса  TechWorker + Worker
        //instanceof -проверяет, является ли объект в переменной, объектом определенного типа
        for (int i = 0; i < workers.length; i++) {
            Worker worker = workers[i];
            if (worker instanceof AdministrationWorker) {
                AdministrationWorker administrationWorker = (AdministrationWorker) worker;
                administrationWorker.printGreetings();
            }
        }


    }
}
