package com.telran.prof.lessons.lesson8.hw.tasktwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescendingComparatorApp {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 4);

        System.out.println(numbers);
        Collections.sort(numbers, new DescendingComparator());
        System.out.println(numbers);
    }
}
