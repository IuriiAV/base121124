package com.telran.prof.lessons.lesson5;

/**
 * В Джаве примитивные типы передаются в методы все передается по значению
 */
public class PrimitiveExample {

    /*
    HEAP: reference
    -----------------
    STaACK(LIFO - last input, first output


     */
    public static void main(String[] args) {
        int a = 10;
        mult(a); //mult(10)
    }

    public static void mult(int a) {
        a = a * 2;
    }
}
