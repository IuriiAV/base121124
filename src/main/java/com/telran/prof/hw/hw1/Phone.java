package com.telran.prof.hw.hw1;

public class Phone {

    private String number;

    private String model;

    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("Phone number: " + number + "; model: " + model + "; weight: " + weight);
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println(name + " call");
    }

}
