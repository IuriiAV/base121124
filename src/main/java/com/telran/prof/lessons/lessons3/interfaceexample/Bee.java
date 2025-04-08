package com.telran.prof.lessons.lessons3.interfaceexample;

public class Bee implements Flyable, Buzzable {


    @Override
    public void fly() {
        System.out.println("Beeee");
    }


    @Override
    public void buzz() {

    }
}
