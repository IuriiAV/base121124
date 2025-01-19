package com.telran.prof.lessonfour.abstrexample;

public class AirportApp {

    public static void main(String[] args) {
        Airplane boeing = new Boeing("777");
        Airplane airbus = new Airbus("320");

        Airplane[] airplanes = {boeing, airbus};
        airplanes[0].fly();
        airplanes[1].fly();
    }
}
