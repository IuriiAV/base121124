package com.telran.prof.lessonfour.abstrexample;

public class WaterPlane extends Airplane{

    public WaterPlane(String name) {
        super(name);
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }
}
