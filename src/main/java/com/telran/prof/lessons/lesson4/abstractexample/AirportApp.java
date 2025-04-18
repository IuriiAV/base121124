package com.telran.prof.lessons.lesson4.abstractexample;

public class AirportApp {

    public static void main(String[] args) {
        Airplane boeing = new Boeing("Boeing");
        Airplane airbus = new Airbus("Bus");

        Airplane[] airplanes = {boeing, airbus};
        airplanes[0].fly();
        airplanes[1].fly();
    }
}
