package com.telran.prof.lessons.lesson10.priorityExample;

import java.util.*;

public class HospitalApp {

    public static void main(String[] args) {
        Queue<Patient> patients = new PriorityQueue<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            patients.add(new Patient("a" + i, random.nextInt(1)));
        }
        System.out.println(patients);

        HighPriorityPatientGenerator patientGenerator = new HighPriorityPatientGenerator(patients);
        new Thread(patientGenerator).start();

        while (!patients.isEmpty()) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (Patient patient : patients)
                System.out.println(patient);
            Patient poll = patients.poll();
            System.out.println("Next " + poll);
        }
    }
}
