package com.telran.prof.lessonone;

//Имя класса это всегда существительное в единственном числе
//Имя класса задается в стиле UpperCamelCase
//BookStorage

//Конструктор должен быть у каждого класса
//Если его явно нет - то компилятор достроит его сам
public class Car {

    String model;

    int yearOfProduction;

    String vin;

    public Car() {
        System.out.println("create object");
    }

    public Car(String model, int yearOfProduction, String vin) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.vin = vin;
    }

    void drive() {
        System.out.println("Car with model " + model + " driving");
    }

    void startEngine() {

    }

    void stopEngine() {

    }
}
