package com.telran.prof.lessons.homework._06_02_25;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskThree {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        System.out.println(findIntersection(list1, list2)); // [3, 4, 5]
    }

    public static Set<Integer> findIntersection(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);

        Set<Integer> intersection = new HashSet<>();

        for (Integer number : list2) {
            if (set1.contains(number)) {
                intersection.add(number);
            }
        }

        return intersection;
    }
}
