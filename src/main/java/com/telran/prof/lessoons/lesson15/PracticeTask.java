package com.telran.prof.lessoons.lesson15;

import java.util.function.*;

public class PracticeTask {

    public static void main(String[] args) {
        //Use Supplier
        //получить рандомное значение для int, double, long, boolean

        IntSupplier intSupplier = () -> (int) (Math.random() * 100);
        DoubleSupplier doubleSupplier = () -> (Math.random() * 100.0);
        LongSupplier longSupplier = () -> (long) (Math.random() * 100);
        BooleanSupplier booleanSupplier = () -> Math.random() < 0.5;

        System.out.println(intSupplier.getAsInt());
        System.out.println(doubleSupplier.getAsDouble());
        System.out.println(longSupplier.getAsLong());
        System.out.println(booleanSupplier.getAsBoolean());

        //Class Student (id, name, surname)
        //List with 10 Students
        //Use Function -> convert to list with 10 id
    }
}
