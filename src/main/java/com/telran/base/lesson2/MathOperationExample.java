package com.telran.base.lesson2;

public class MathOperationExample {

    public static void main(String[] args) {
        // +, -, * , / , %
        int numberOne = 10;
        int numberTwo = 7;

        int sum = numberOne + numberTwo;
        System.out.println("Sum 10 and 7 = " + sum);

        int sub = numberOne - numberTwo;
        System.out.println("Sub 10 and 7 = " + sub);

        int result = sub + sum;
        System.out.println("Result = " + result);

        //int mult = numberOne * numberTwo;
        System.out.println("Mult 10 * 7 = " + (numberOne * numberTwo));

        System.out.println("Sum " + numberOne + " and " + numberTwo + " = " + sum);
    }
}
