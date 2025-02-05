package com.telran.prof.lessoons.lesson8.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortIntExample {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(9);
        integers.add(6);
        integers.add(98);
        integers.add(47);
        integers.add(4);
        integers.add(1);
        integers.add(0);
        System.out.println("List before sort " + integers);

        Collections.sort(integers);
        System.out.println("List after sort " + integers);

        List<String> strings = Arrays.asList(
                "Two",
                "One",
                "Hello",
                "Java");
        System.out.println("List before sort " + strings);
        Collections.sort(strings);
        System.out.println("List after sort " + strings);
    }
}
