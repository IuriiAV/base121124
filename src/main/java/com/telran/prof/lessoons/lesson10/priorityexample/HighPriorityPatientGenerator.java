package com.telran.prof.lessoons.lesson10.priorityexample;

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
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            patients.add(new Patient("UrgentPatient" , random.nextInt(10)));
        }
    }
}
