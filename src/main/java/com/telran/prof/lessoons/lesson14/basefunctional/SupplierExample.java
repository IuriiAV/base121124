package com.telran.prof.lessoons.lesson14.basefunctional;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Double> randomizer = () -> Math.random();
        System.out.println(randomizer.get());
        System.out.println(randomizer.get());
        System.out.println(randomizer.get());
        System.out.println(randomizer.get());
        System.out.println(randomizer.get());
    }
}
