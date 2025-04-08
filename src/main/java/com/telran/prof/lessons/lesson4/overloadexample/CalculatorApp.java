package com.telran.prof.lessons.lesson4.overloadexample;

import java.util.Arrays;

public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5, 7));
        System.out.println(calculator.sum(5, 7, 3));
        System.out.println(calculator.sum(5, 7, 3, 2));
        System.out.println(calculator.sum(3.5, 5.6));
    }
}
