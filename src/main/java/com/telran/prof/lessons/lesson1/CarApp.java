package com.telran.prof.lessons.lesson1;

import java.security.SecureRandom;
public class CarApp {

    public static void main(String[] args) {
        Car carOne = new Car(); //Car() - вызов конструктора без параметров
        Car carTwo = new Car();
        Car carThree = new Car();

        carOne.model = "Audi";
        carTwo.model = "BMW";
        carThree.model = "VW";

        carOne.vin = "ASDASD123123";
        String model = carOne.model;

        carOne.drive();
        carTwo.drive();
    }
}
