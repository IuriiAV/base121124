package com.telran.prof.lessons.lesson3.interfaceexample;

public class App {

    public static void main(String[] args) {
        Bee bee = new Bee();
        Plane plane = new Plane();
        Flyable[] flyables = {bee, plane};
        for (Flyable flyable : flyables) {
            flyable.fly();
        }
        Buzzable[] buzzables = {bee,plane};
        for (Buzzable buzzable : buzzables) {
            buzzable.buzz();
        }
    }
}
