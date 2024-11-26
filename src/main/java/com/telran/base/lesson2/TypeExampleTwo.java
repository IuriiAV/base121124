package com.telran.base.lesson2;

public class TypeExampleTwo {

    public static void main(String[] args) {
        int numberOne = 5;
        int numberTwo = 3;

        System.out.println(numberOne);
        System.out.println(numberTwo);

        int numberThree = numberTwo;
        System.out.println("Value from variable three = " + numberThree);
        numberOne = 20;
        System.out.println("New value from variable one  = " + numberOne );
    }
}
