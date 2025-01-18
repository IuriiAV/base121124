package com.telran.prof.lessoons.lesson5;

/**
 * В Джаве примитивы передаютмя по знасению
 */

public class PrimitiveExample {

    /*
    HEAP: references

    ---------------------
    STACK(LIFO - last input, first output): примитивные и методы
    |            |
    |            |
    |            |
    |            |
    |mult: int a = 10; a = a * 2|
    |main: int a = 10; mult(10)| когда метод завершает работу он удаляется



     */

    public static void main(String[] args) {
        int a = 10;
        mult(a); //mult(10)
    }

    public static void mult(int a) {
        //int a = 10;
        a = a * 2;
    }
}
