package com.telran.prof.lessons.homework._06_02_25;

import java.util.Arrays;
import java.util.HashSet;

public class TaskHashSetArray {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        int[] intsTwo = {1, 2, 3, 4, 1};
        System.out.println(Arrays.toString(ints) + " " + aBoolean(ints));
        System.out.println(Arrays.toString(intsTwo) + " " + aBoolean(intsTwo));
    }

    public static boolean aBoolean(int[] numbers) {
        HashSet<Integer> integers = new HashSet<>();

        for (int number : numbers) {
            if (integers.contains(number)) {
                return false;
            }
            integers.add(number);
        }

        return true;
    }
}
