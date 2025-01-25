package com.telran.prof.lessons.lesson5;

import java.util.Arrays;

public class ReferenceExample {

    public static void main(String[] args) {
        int a = 10; // primitive
        int[] array = {1,2,3}; // reference
        modifyArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void modifyArray(int[] array){
        array[0] = 5;
    }
}
