package com.telran.prof.lessontwentytwo;

public class NumberApp {

    public static void main(String[] args) {
        OnlyNumber<Long> longOnlyNumber = new OnlyNumber<>(4L);
        longOnlyNumber.printNumber();

        OnlyNumber<Double> doubleOnlyNumber = new OnlyNumber<>(45.444);
        doubleOnlyNumber.printNumber();
    }
}
