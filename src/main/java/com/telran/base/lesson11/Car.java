package com.telran.base.lesson11;

/**
 * Для создаваемого объекта на основании этого класса, типом переменной
 * в которой, будет храниться наш объект, и будет тип этого класса
 * <p>
 * Конструктор обязан быть в каждом классе, если никаких конструкторов
 * нет, то компилятор сам его создаст, но только если никаких нет!!!
 */
public class Car {

    //Элементы данных (набор полей это состояние объекта)
    //Свойства объекта, Характеристики объекта, поля класса - это все одно и тоже
    String serialNumber;

    String color;

    //Конструктор без параметров
    public Car() {
        System.out.println("Create new car");
    }

    //Конструктор с параметрами
    public Car(String serialNumber, String color) {
        this.serialNumber = serialNumber;
        this.color = color;
    }

    //Конструктор с параметрами
    public Car(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void drive() {
        System.out.println("Car with color " + this.color +
                " and serial number " + this.serialNumber + " is driving");
    }
}
