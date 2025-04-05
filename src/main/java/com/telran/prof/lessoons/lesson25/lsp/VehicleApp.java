package com.telran.prof.lessoons.lesson25.lsp;

public class VehicleApp {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        drive(vehicle);
        MiniCar miniCar = new MiniCar();
        drive(miniCar);
        Bicycle bicycle = new Bicycle();
        drive(bicycle);
    }

    private static void drive(Vehicle vehicle) {
        vehicle.drive();
    }
}
