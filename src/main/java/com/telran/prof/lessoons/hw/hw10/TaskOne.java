package com.telran.prof.lessoons.hw.hw10;

import java.util.List;
import java.util.stream.Collectors;

public class TaskOne {

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Andrew", "Charlie", "Anna");

        List<String> namesStartsWithA = names.stream()
                .filter(string -> string.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(namesStartsWithA);
    }
}
