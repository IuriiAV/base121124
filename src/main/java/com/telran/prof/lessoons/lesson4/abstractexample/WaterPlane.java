package com.telran.prof.lessoons.lesson4.abstractexample;

public class WaterPlane extends Airplane{


    public WaterPlane(String name) {
        super(name);
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }
}
