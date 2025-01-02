package com.telran.base.lesson11.calc;

public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calc = new Calculator("Eng");
        calc.printSum(5, 10);
        calc.printSum(10,6);
        calc.switchLanguage();
        calc.printSum(5,6);

        calc.switchLanguage();
        calc.printSum(56,77);
    }
}