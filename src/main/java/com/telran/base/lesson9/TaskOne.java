package com.telran.base.lesson9;

public class TaskOne {

    public static void main(String[] args) {
        int[] array = {3, 4, 3, 5, 6, 8, 1, -3, 22, 35, 70, 8, 9};
        //Написать метод, который вернет максимальный элемент массива
        System.out.println(getMax(array));
        System.out.println(getMin(array));
        printIndexes(array, 8);
    }

    private static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
//            if (array[i] >= max) {
//                max = array[i];
//            }
        }
        return max;
    }

    private static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

    private static void printIndexes(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
             if (array[i] == target) {
                 System.out.println("Index of = " + i);
             }
        }
    }
}
