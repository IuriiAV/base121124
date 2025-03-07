package com.telran.prof.lessons.lesson9.homework.taskthree;

import java.util.*;

public class TaskThree {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        System.out.println(findIntersection(list1, list2));
    }

    public static Set<Integer> findIntersection(List<Integer> list1, List<Integer> list2) {
        Set<Integer> intersection = new HashSet<>();
        Set<Integer> findIntersection = new HashSet<>(list1);
        for (Integer i : list2){
            if (!findIntersection.add(i)){
                intersection.add(i);
            }
        }
        return intersection;
    }
}
