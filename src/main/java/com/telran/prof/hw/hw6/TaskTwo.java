package com.telran.prof.hw.hw6;

import java.util.HashSet;
import java.util.Set;

public class TaskTwo {

    public static void main(String[] args) {
        int[] numbers = {1, 4, 3, 5, 6, 7, 8, 9, 10};
        int[] ints = {1, 9, 3, 5, 6, 7, 8, 9, 10};

        System.out.println(areAllUnique(numbers));
        System.out.println(areAllUnique(ints));
    }

    public static boolean areAllUnique(int[] ints) {
        Set<Integer> integerSet = new HashSet<>();
        for (int i : ints) {
            integerSet.add(i);
        }
        if (ints.length == integerSet.size()) {
            return true;
        }
        return false;
    }
}
