package com.telran.prof.lessons.lessonsone;

public class CarApp {

    public static void main(String[] args) {
        Car carOne = new Car();
        Car carTwo = new Car();
        Car carThree = new Car();

        carOne.model = "Audi";
        carTwo.model = "BMW";
        carThree.model = "VW";

        carOne.vin = "EFN234IHF";
        String model = carOne.model;
        carOne.yearOfProduction = -4543;

        carOne.drive();
        carTwo.drive();

    }
}
