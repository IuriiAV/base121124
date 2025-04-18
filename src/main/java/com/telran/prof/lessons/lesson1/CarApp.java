package com.telran.prof.lessons.lesson1;

public class CarApp {

    public static void main(String[] args) {
        Car carOne = new Car();
        Car carTwo = new Car();
        Car carTree = new Car();

        carOne.model = "Audi";
        carTwo.model = "BMW";
        carTree.model = "VW";

        carOne.vin = "ARSF6732";
        String model = carOne.model;
        carOne.yearOfProduction = -20202;

        carOne.drive();
        carTwo.drive();
    }
}
