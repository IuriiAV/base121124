package com.telran.prof.lessoons.lesson22;

public class OnlyNumber <T extends Number>{

    private T number;

    public OnlyNumber(T number) {
        this.number = number;
    }

    public void ptintNumber() {
        System.out.println(number);
    }
}
