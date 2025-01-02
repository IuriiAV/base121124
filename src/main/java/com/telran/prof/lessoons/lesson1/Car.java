package com.telran.prof.lessoons.lesson1;

public class Car {

    String model;

    int yearOfProduction;

    String vin;

    void drive() {
        System.out.println("Car with model " + model + " driving");
    }

    void startEngine() {

    }

    void stopengine() {

    }

    public Car() {
        System.out.println("create object");
    }

    public Car(String model, int yearOfProduction, String vin) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.vin = vin;
    }
}
