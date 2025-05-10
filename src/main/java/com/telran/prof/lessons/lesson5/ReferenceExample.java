package com.telran.prof.lessons.lesson5;

public class ReferenceExample {

    public static void main(String[] args) {
        int a = 10; // primitive
        int[] array = {1, 2, 3}; //reference
        modifyArray(array);
    }

    public static void modifyArray(int[] array) {
        array[0] = 5;
    }
}
