package com.telran.prof.lessons.homework.algoritms;

public class MaxElementOfArrayWithRecursion {

    public static void main(String[] args) {
        int[] array = new int[]{1, 11, 9, 6, 19, 5};

        System.out.println("Iteration: " + maxIterationOfArray(array));

        int max = maxRecursionOfArray(array, 0, array[0]);
        System.out.println("Recursion: " + max);
    }

    public static int maxIterationOfArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }

    public static int maxRecursionOfArray(int[] array, int index, int max) {
        if (index == array.length)
            return max;

        if (array[index] > max)
            max = array[index];

        return maxRecursionOfArray(array, index + 1, max);
    }
}
