package com.telran.prof.lessoons.lesson4.abstractexample;

public class AirportApp {

    public static void main(String[] args) {
        Boeing boeing = new Boeing("");
        Airbus airbus = new Airbus("");

        Airplane[] airplanes = {airbus, boeing};
        airplanes[0].fly();
        airplanes[1].fly();
    }
}
