package com.telran.prof.lessoons.hw.hw10;

import java.util.List;

public class TaskTwo {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 2, 9, 5);

        Integer integer = numbers.stream()
                .sorted()
                .max(Integer::compareTo)
                .get();
        System.out.println(integer);
    }
}
