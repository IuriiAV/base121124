package com.telran.prof.lessons.lesson3.interfaceexample;

public class Bee implements Flyable, Buzzble {

    @Override
    public void fly() {
        System.out.println("Beeeeeeeee");
    }

    @Override
    public void buzz() {
        System.out.println("Bee buzz");
    }
}
