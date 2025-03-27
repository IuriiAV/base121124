package com.telran.prof.lessontwentytwo.pecs;

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
        //PECS - producer extends, consumer super
        addCar(cars);
    }

    private static void printCars(List<? extends Car> cars) { // List<Truck>
        for (Car car : cars) {
            System.out.println(car);
        }
        //cars.add(new Mini());
    }

    //List<? super Mini> - List<Mini>, List<Car>, List<Object>
    //List<? super Car> -  List<Car>, List<Object>
    private static void addCar(List<? super Car> cars) { // List<Car> or her parents
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
