package com.telran.prof.lessons.lesson10.priorityexample;

public class Patient implements Comparable<Patient>{

    private String name;

    private int risk;

    public Patient(String name, int risk) {
        this.name = name;
        this.risk = risk;
    }

    @Override
    public int compareTo(Patient o) {
        return (risk - o.risk) * -1;
    }

    public String getName() {
        return name;
    }

    public int getRisk() {
        return risk;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", risk=" + risk +
                '}';
    }
}
