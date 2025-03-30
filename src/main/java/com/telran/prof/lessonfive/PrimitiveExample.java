package com.telran.prof.lessonfive;

/**
 * В Java примитивные типы передаются в методы по значению
 *
 */
public class PrimitiveExample {

    /*
    HEAP : references

    -------------------------------------
    STACK(LIFO - last input, first output):

    |        |
    |        |
    |        |
                                |mult: int a = 10; a = a *2 ; a = 20|
    |main: int a = 10;_mult(10); a = 20|

     */
    public static void main(String[] args) {
        int a = 10;
        a = mult(a); // mult(10);
    }

    public static int mult(int a) {
        //int a = 10;
        a = a * 2;
        return a;
    }
}
