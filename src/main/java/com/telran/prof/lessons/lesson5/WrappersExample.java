package com.telran.prof.lessons.lesson5;

public class WrappersExample {

    public static void main(String[] args) {
        //int, char, short, boolean, float, long, double
        //Wrappers : Integer - int, Character - char,
        //Short - short, Boolean - boolean,
        //Long - long, Float - float, Double - double

        //Autoboxing and unboxing

        int a = 10; // stack
        Integer b = a; // autoboxing // new Integer(10) // b - stack, = heap
        System.out.println(a);
        System.out.println(b);

        Integer i = new Integer(15);// Integer.value(of)
        int c = i; //unboxing

        Character one = new Character('a');
        char two = one;
        Character three = 'a';

        String value = "5";
        int i1 = Integer.parseInt(value);
        System.out.println("Parsed = " + i1);
    }
}
