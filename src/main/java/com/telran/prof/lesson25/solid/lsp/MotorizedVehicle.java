package com.telran.prof.lesson25.solid.lsp;

public abstract class MotorizedVehicle extends Vehicle {

    @Override
    public void drive() {
        super.drive();
        startEngine();
    }

    protected void startEngine() {
        System.out.println("Engine start");
    }
}
