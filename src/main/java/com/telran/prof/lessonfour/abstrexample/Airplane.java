package com.telran.prof.lessonfour.abstrexample;

public abstract class Airplane {

    private String name;

    public Airplane(String name) {
        this.name = name;
    }

    public abstract void fly();

    protected void info() {

    }
}
