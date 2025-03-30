package com.telran.prof.lessoons.hw.hw10;

import java.util.List;

public class TaskFive {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        long count = numbers.stream()
                .filter(number -> number %2 == 0)
                .count();
        System.out.println(count);
    }
}
