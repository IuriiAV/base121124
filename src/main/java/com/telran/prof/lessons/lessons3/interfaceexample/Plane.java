package com.telran.prof.lessons.lessons3.interfaceexample;

public class Plane implements Flyable, Buzzable{


    @Override
    public void fly() {
        System.out.println("Plane fly");
    }

    @Override
    public void buzz() {

    }
}
