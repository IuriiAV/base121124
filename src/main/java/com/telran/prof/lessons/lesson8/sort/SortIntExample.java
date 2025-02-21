package com.telran.prof.lessons.lesson8.sort;

import java.util.*;

public class SortIntExample {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(8);
        integers.add(2);
        integers.add(0);
        integers.add(7);
        integers.add(1);
        integers.add(3);
        System.out.println("List before sort " + integers);

        Collections.sort(integers);
        System.out.println("List after sort " + integers);

        List<String> strings = Arrays.asList(
                "Two",
                "One",
                "Hello",
                "Java"
                );
        System.out.println("List before sort " + strings);
        Collections.sort(strings);
        System.out.println("List before sort " + strings);
    }
}
