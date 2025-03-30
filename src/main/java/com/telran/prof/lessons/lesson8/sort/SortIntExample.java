package com.telran.prof.lessons.lesson8.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortIntExample {

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
                "Three",
                "Hello",
                "Java");
        System.out.println("List before sort " + strings);
        Collections.sort(strings);
        System.out.println("List after sort " + strings);
    }
}
