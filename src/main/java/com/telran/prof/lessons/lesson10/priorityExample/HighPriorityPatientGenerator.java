package com.telran.prof.lessons.lesson10.priorityExample;

import java.util.Queue;
import java.util.Random;

public class HighPriorityPatientGenerator implements Runnable{

    private Queue<Patient> patients;

    public HighPriorityPatientGenerator(Queue<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            patients.add(new Patient("Urgent Patient", random.nextInt(10)));
        }
    }
}

