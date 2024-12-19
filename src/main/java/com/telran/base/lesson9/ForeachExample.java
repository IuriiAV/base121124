package com.telran.base.lesson9;

public class ForeachExample {

    public static void main(String[] args) {
        int[] array = {3, 4, 3, 5, 6, 8, 1, 0, 22, 35, 70, 7, 9};

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            System.out.print(value + " ");
        }

        System.out.println();

        //foreach
        //for(<type> <name variable> : <array>)
        for(int value : array) {
            System.out.print(value + " ");
        }

    }
}
