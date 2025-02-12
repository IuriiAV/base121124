package com.telran.prof.lessoons.lesson10.priorityexample;

import java.util.*;

public class HospitalApp {

    public static void main(String[] args) {
        Queue<Patient> patients = new PriorityQueue<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            patients.add(new Patient("a" + i, random.nextInt(10)));
        }
        System.out.println(patients);
        HighPriorityPatientGenerator highPriorityPatientGenerator = new HighPriorityPatientGenerator(patients);
        new Thread(highPriorityPatientGenerator).start();

        while (!patients.isEmpty()) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (Patient patient : patients) {
                System.out.println(patient);
            }
            Patient poll = patients.poll();
            System.out.println("Next " + poll);
            System.out.println(" ");
        }
    }
}
