package com.telran.prof.lessoons.lesson22;

public class NumberApp {

    public static void main(String[] args) {
        OnlyNumber<Long> longOnlyNumber = new OnlyNumber<>(4L);
        longOnlyNumber.ptintNumber();

        OnlyNumber<Double> doubleOnlyNumber = new OnlyNumber<>(787.89);
        doubleOnlyNumber.ptintNumber();
    }
}
