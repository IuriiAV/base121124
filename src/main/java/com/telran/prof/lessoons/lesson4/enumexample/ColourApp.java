package com.telran.prof.lessoons.lesson4.enumexample;

public class ColourApp {

    public static void main(String[] args) {
        Color[] values = Color.values();
        for (Color color : values) {
            System.out.println(color);
        }

        int ordinal = Color.RED.ordinal();
        System.out.println(ordinal);

        Car car = new Car("Audi", Color.RED);

        String name = Color.BLACK.name();
        System.out.println(name);

        String cl = "RED";
        Color color = Color.valueOf(cl);
        System.out.println(color);

    }
}
