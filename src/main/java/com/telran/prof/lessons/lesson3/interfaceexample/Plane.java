package com.telran.prof.lessons.lesson3.interfaceexample;

public class Plane implements Flyable, Buzzble {

    @Override
    public void fly() {
        System.out.println("Plane flight");
    }

    @Override
    public void buzz() {
        System.out.println("Plane buzz");
    }
}
