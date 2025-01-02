package com.telran.base.lesson9.carexample;

public class CarBubbleSort {

    public static void main(String[] args) {
        Car carOne = new Car("BMW", 2.5);
        Car carTwo = new Car("Audi", 3.7);
        Car carThree = new Car("VW", 1.8);
        Car carFour = new Car("Skoda", 2.1);
        Car carFive = new Car("Seat", 1.4);

        System.out.println(carFive.model + "_" + carFive.price);
        System.out.println(carThree.model + "_" + carThree.price);

        Car[] cars = {carOne, carFive, carFour, carThree, carTwo};
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println("Model "+ car.model + " price " + car.price);
        }

        //HW - отсортировать массив автомобилей по цене - по возрастанию
        //HW* - отсортировать массив автомобилей по первой букве модели - по алфавиту
    }
}