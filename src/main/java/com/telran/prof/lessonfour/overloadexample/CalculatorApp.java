package com.telran.prof.lessonfour.overloadexample;

public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5, 7));
        System.out.println(calculator.sum(5, 7, 3));
        System.out.println(calculator.sum(4, 5, 3, 2));
        System.out.println(calculator.sum(3.5, 5.6));
    }
    //3 + 6 * 7 - 9/2 POLIZ
    //* / + -
    //6 7 3 9 2

    //[1,2,2,1,4]
    //int sum = 0;
    //for(int value : arr) {
    // sum = sum ^ value;
    //}
    // sum -!!!
}
