package com.telran.prof.lessons.lesson10.priorityexample;

import java.util.*;

public class HospitalApp {

    public static void main(String[] args) {
        Queue<Patient> patients = new PriorityQueue<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            patients.add(new Patient("a"+i,random.nextInt(1)));
        }
        System.out.println(patients);

        HighPriorityPatientGenerator highPriorityPatientGenerator = new HighPriorityPatientGenerator(patients);

        while (!patients.isEmpty()){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Patient poll = patients.poll();
            System.out.println(poll);
        }
    }
}
