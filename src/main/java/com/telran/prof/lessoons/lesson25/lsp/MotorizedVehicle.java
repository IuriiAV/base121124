package com.telran.prof.lessoons.lesson25.lsp;

public class MotorizedVehicle extends Vehicle{

    @Override
    public void drive() {
        super.drive();
        startEngine();
    }

    protected void startEngine() {
        System.out.println("Engine start");
    }
}
