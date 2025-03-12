package com.telran.prof.lessons.lesson15;

import java.util.Random;
import java.util.function.*;

public class PracticeTask {

    public static void main(String[] args) {
        //Use Supplier
        //получить рандомное значение для int, double, long, boolean
        Random random = new Random();
        IntSupplier randomInt = () -> random.nextInt();
        System.out.println(randomInt.getAsInt());

        DoubleSupplier randomDouble = () -> random.nextDouble();
        System.out.println(randomDouble.getAsDouble());

        LongSupplier randomLong = () -> random.nextLong();
        System.out.println(randomLong.getAsLong());

        BooleanSupplier randomBoolean = () -> random.nextBoolean();
        System.out.println(randomBoolean.getAsBoolean());

        //-----------------------------------------------------------------


    }
    /**
     * public static void main(String[] args) {
     *     //Use Supplier
     *     //получить рандомное значение для int, double, long, boolean
     *
     *     IntSupplier intSupplier = () -> (int) (Math.random() * 100);
     *     DoubleSupplier doubleSupplier = () -> (Math.random() * 100.0);
     *     LongSupplier longSupplier = () -> (long) (Math.random() * 100);
     *     BooleanSupplier booleanSupplier = () -> Math.random() < 0.5;
     *
     *     System.out.println(intSupplier.getAsInt());
     *     System.out.println(doubleSupplier.getAsDouble());
     *     System.out.println(longSupplier.getAsLong());
     *     System.out.println(booleanSupplier.getAsBoolean());
     * }
     */
}
