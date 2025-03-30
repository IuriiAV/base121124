package com.telran.prof.lessoons.lesson22.pecs;

import java.util.ArrayList;
import java.util.List;

public class CarApp {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car());
        cars.add(new Mini());

        printCars(cars);
        modifyCars(cars);

        List<Mini> minis = new ArrayList<>();
        minis.add(new Mini());
        minis.add(new Mini());
        minis.add(new Mini());
        minis.add(new Mini());
        printCars(minis);
        //PECS - produces extends, consumer super

        //addCar(minis);
        addCar(cars);
    }

    private static void printCars(List<? extends Car> cars) {
        for(Car car : cars) {
            System.out.println(car);
        }
        //cars.add(new Mini());
    }

    private static void addCar(List<? super Car> cars) { //Car or her parents
        cars.add(new Mini());
        cars.add(new Car());
        System.out.println("after add car");
    }

    private static void modifyCars(List<Car> cars) {
        cars.add(new Car());
        cars.add(new Mini());
        System.out.println(cars);
    }
}
