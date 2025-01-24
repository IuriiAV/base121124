package com.telran.prof.lessonfour.enumexample;

import java.nio.charset.CoderResult;

import static com.telran.prof.lessonfour.enumexample.Color.WHITE;

public class ColorApp {

    public static void main(String[] args) {
        Color[] values = Color.values();
        for (Color color : values) {
            System.out.println(color);
        }

        int ordinal = Color.RED.ordinal();
        System.out.println(ordinal);

        Car audi = new Car("Audi", WHITE);
        // model | color
        // Audi  | 1

        String name = Color.BLACK.name();
        System.out.println("String of enum is " + name);

        String cl = "PINK1";
        Color color = Color.valueOf(cl);
        System.out.println(color);


    }
}
