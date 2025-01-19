package com.telran.prof.lessons.lesson4.abstractexample;

public class Airport {

    public static void main(String[] args) {
        Airplane boeing = new Boeing("777");
        Airplane airbus = new Airbus("230");

        Airplane[] airplanes = {boeing, airbus};
        airplanes[0].fly();
        airplanes[1].fly();
    }
}
