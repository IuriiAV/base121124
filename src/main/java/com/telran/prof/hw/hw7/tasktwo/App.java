package com.telran.prof.hw.hw7.tasktwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 4);

        Collections.sort(numbers, new DescendingComparator());
        System.out.println(numbers);
    }
}
