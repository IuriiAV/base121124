package com.telran.prof.lessoons.lesson4.abstractexample;

public class Airbus extends Airplane{

    public Airbus(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Airbus flying");
    }
}
