package com.telran.base.lesson5;

public class ExampleMethodConditional {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        //boolean result =  a < b;
        //boolean result = checkNumbers(a, b);

        if (checkNumbers(a, b)) {
            System.out.println(" A < B");
        }
    }

    public static boolean checkNumbers(int a, int b) {
        //super complex code
        return a < b;
    }
}
