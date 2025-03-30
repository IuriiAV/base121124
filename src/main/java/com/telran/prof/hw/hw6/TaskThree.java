package com.telran.prof.hw.hw6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskThree {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        System.out.println(findIntersection(list1, list2));
    }

    public static Set<Integer> findIntersection(List<Integer> list1, List<Integer> list2) {
        Set<Integer> setOne = new HashSet<>(list1);
        Set<Integer> setTwo = new HashSet<>();
        for (Integer num : list2) {
            if (setOne.contains(num)) {
                setTwo.add(num);
            }
        }
        return setTwo;
    }
}
