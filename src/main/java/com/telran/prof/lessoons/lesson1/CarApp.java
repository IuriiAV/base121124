package com.telran.prof.lessoons.lesson1;

public class CarApp {

    public static void main(String[] args) {
        Car carOne = new Car();
        Car carTwo = new Car();
        Car carThree = new Car();

        carOne.model = "Audi";
        carTwo.model = "BMW";
        carThree.model = "VW";

        carOne.vin = "FJHGDK65748";

        String model = carOne.model;

        carOne.drive();
        carTwo.drive();
    }
}
