package com.telran.base.lesson2;

public class FullTypeListExample {

    public static void main(String[] args) {
        //default value 0
        byte byteNumber = 100; // -128 to 127 ; 8bits
        //byte testNumber = 500; incorrect
        short shortNumber = 14567; // -32768 to 32767; 16 bits
        int intNumber = 343423423; // -2billion to 2 billion ; 32bits
        long longNumber = 3445345345453L; // 64 bits

        //default value 0.0
        float floatNumber = 124343.34234f; //8 before . 7 after ; 32 bit
        double doubleNumber = 32323232232.333333; // 64 bit

        byte byteNumberTest = 10;
        byte byteNumberTestTwo = byteNumberTest;

        int intTest = byteNumberTest;
        long longTest = byteNumberTest;

        byte byteTest = (byte) longTest; // кастомизация, приведение типа

        //default value '\u0000'
        char charSym = 'A'; // 16 bit

        ////default value false
        boolean booleanType = true; // 1bit

        //default value null
        String text = "Hello Java!";
    }
}
