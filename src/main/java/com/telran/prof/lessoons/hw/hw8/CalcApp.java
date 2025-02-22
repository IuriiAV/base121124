package com.telran.prof.lessoons.hw.hw8;

public class CalcApp {

    public static void main(String[] args) {
        String string = "3+4*2";
        Calculator calculator = new Calculator();
        String stringRPN = calculator.expressionToRPN(string);
        System.out.println(stringRPN);
        System.out.println(calculator.RPNToAnswer(stringRPN));
    }
}
