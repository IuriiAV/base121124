package com.telran.base.lesson11;

public class CarApp {

    public static void main(String[] args) {
        //Объекты в Джава создаем через ключевое слово new
        //Создание объекта на основании класса Car
        Car carOne = new Car(); // #FFEE00
        Car carTwo = new Car(); // #BBDDAA
        //Это два разных объекта, аналогично двум разным авто на парковке

        carOne.serialNumber = "ASDAD324234";
        carOne.color = "Black";

        carTwo.serialNumber = "SDEFWERWR22";
        carTwo.color = "Red";

        //У каждого создаваемого объекта, есть своя собственная копия всех характеристик
        //этого объекта, со своими собственными значениями

        String serialNumberOne = carOne.serialNumber;
        String serialNumberTwo = carTwo.serialNumber;

        System.out.println("Serial number car one is " + serialNumberOne);
        System.out.println("Serial number car two is " + serialNumberTwo);

        System.out.println("Color one is " + carOne.color + " number one is " + carOne.serialNumber);
        System.out.println("Color two is " + carTwo.color + " number two is " + carTwo.serialNumber);

        Car carThree = new Car("EWRWWRWR", "White");
        System.out.println("car three " + carThree.color + " " + carThree.serialNumber);

        Car carFour = new Car("rwerwerwe");
        carFour.color = "Pink";
        System.out.println("car four " + carFour.color +" " + carFour.serialNumber);

        carFour.drive();
        carOne.drive();
        carTwo.drive();
        carThree.drive();
    }
}
