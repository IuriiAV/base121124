package com.telran.prof.lessonfour.abstrexample;

public class Boeing extends Airplane {

    public Boeing(String name) {
        super(name);
    }

    @Override
    protected void info() {
        super.info();
    }

    @Override
    public void fly() {
        System.out.println("Boeing fly");
    }
}
