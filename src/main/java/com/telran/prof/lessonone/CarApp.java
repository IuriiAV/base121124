package com.telran.prof.lessonone;

public class CarApp {

    public static void main(String[] args) {
        Car carOne = new Car(); // Car() - вызов конструктора без параметров
        Car carTwo = new Car();
        Car carThree = new Car();

        carOne.model = "Audi";
        carTwo.model = "BMW";
        carThree.model = "VW";

        carOne.vin = "ASDSD2342";
        String model = carOne.model;
        carOne.yearOfProduction = -20202;

        carOne.drive();
        carTwo.drive();

    }
}
