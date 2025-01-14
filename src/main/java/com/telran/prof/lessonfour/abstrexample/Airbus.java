package com.telran.prof.lessonfour.abstrexample;

public class Airbus extends Airplane{

    public Airbus(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Airbus fly");
    }
}
