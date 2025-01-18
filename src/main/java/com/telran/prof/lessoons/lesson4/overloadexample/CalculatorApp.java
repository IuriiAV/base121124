package com.telran.prof.lessoons.lesson4.overloadexample;

public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(876543,4321343));
        System.out.println(calculator.sum(876543,4321343,876543));
        System.out.println(calculator.sum(876543,4321343,876543,765432));
        System.out.println(calculator.sum(8765.43,4321.3));
    }
}
