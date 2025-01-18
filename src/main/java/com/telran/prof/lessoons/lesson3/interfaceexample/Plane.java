package com.telran.prof.lessoons.lesson3.interfaceexample;

public class Plane implements Flyable, Buzzable{

    @Override
    public void fly() {
        System.out.println("Plane fly");
    }

    @Override
    public void buzz() {
        System.out.println("Plane buzzzzzzz");
    }
}
