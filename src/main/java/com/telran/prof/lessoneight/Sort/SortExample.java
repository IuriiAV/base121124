package com.telran.prof.lessoneight.Sort;

import java.util.*;

public class SortExample {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(3);
        integers.add(2);
        integers.add(7);
        integers.add(3);
        integers.add(10);
        System.out.println("List before sort " + integers);

        Collections.sort(integers);
        System.out.println("List after sort " + integers);

        List<String> strings = Arrays.asList(
                "Two",
                "One",
                "Helloy",
                "Java"
        );
        System.out.println("List before sort " + strings);
        Collections.sort(strings);
        System.out.println("List after sort " + strings);
    }
}
