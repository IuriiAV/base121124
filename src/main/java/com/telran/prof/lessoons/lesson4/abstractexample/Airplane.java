package com.telran.prof.lessoons.lesson4.abstractexample;

public abstract class Airplane {

    private String name;

    public Airplane(String name) {
        this.name = name;
    }

    public abstract void fly();

    protected void info() {

    }
}
