package com.telran.prof.lessons.lesson4.enumexample;

import static com.telran.prof.lessons.lesson4.enumexample.Color.WHITE;

public class ColoApp {

    public static void main(String[] args) {
        Color[] values = Color.values();
        for (Color color : values) {
            System.out.println(color);
        }

        int ordinal = Color.RED.ordinal();
        System.out.println(ordinal);

        // Audi | 1

        String name = Color.BLACK.name();
        System.out.println("String of enum is " + name);

        String cl = "PINK";
        Color color = Color.valueOf(cl);
        System.out.println(color);
    }
}
