package com.telran.prof.lesson25.solid.lsp;

public abstract class ManualVehicle extends Vehicle {

    @Override
    public void drive() {
        super.drive();
        startManualAction();
    }

    protected void startManualAction() {
        System.out.println("Manual action start");
    }
}
