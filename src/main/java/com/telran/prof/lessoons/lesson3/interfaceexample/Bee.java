package com.telran.prof.lessoons.lesson3.interfaceexample;

public class Bee implements Flyable, Buzzable{

    @Override
    public void fly() {
        System.out.println("Beeeeeeee");
    }

    @Override
    public void buzz() {
        System.out.println("Bee buzzzzzz");
    }
}
