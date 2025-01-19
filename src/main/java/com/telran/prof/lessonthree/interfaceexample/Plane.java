package com.telran.prof.lessonthree.interfaceexample;

public class Plane implements Flyable,Buzzable {

    @Override
    public void fly() {
        System.out.println("Plane flight");
    }

    @Override
    public void buzz() {
        System.out.println("Plane buzz");
    }
}
