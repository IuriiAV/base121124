package com.telran.prof.lessonthree.interfaceexample;

public class Bee implements Flyable,Buzzable {

    @Override
    public void fly() {
        System.out.println("Beeeeeeee");
    }

    @Override
    public void buzz() {
        System.out.println("Bee buzzzzzzz");
    }
}
