package com.telran.prof.lessontwentytwo;

public class OnlyNumber<T extends Number> {

    private T number;

    public OnlyNumber(T number) {
        this.number = number;
    }

    public void printNumber() {
        System.out.println(number);
    }
}
