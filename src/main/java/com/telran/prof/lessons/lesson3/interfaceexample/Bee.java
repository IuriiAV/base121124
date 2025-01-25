package com.telran.prof.lessons.lesson3.interfaceexample;

public class Bee implements Flyable, Buzzable {


    @Override
    public void fly() {
        System.out.println("Beeee");
    }


    @Override
    public void buzz() {

    }
}
