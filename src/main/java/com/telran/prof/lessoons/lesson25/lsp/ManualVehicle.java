package com.telran.prof.lessoons.lesson25.lsp;

public abstract class ManualVehicle extends Vehicle{

    public void drive() {
        super.drive();
        startManualAction();
    }

    protected void startManualAction() {
        System.out.println("Start manual action");
    }
}
