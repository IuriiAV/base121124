package com.telran.prof.lessoons.lesson8;

public class ExampleToComparePrimitive {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a == b) {
            System.out.println("Is equals");
        }
        boolean result = a == b;
        System.out.println(result);
        Integer c = 10;
        boolean b1 = a == c;
        System.out.println("Integer equals int is " + b1);
    }
}
