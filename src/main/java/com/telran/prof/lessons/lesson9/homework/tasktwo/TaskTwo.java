package com.telran.prof.lessons.lesson9.homework.tasktwo;

import java.util.HashSet;
import java.util.Set;

public class TaskTwo {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 1};
        System.out.println(areAllUnique(numbers));
    }

    public static boolean areAllUnique(int[] numbers){
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!hashSet.add(numbers[i])){
                return false;
            }
        }
        return true;
    }
}
