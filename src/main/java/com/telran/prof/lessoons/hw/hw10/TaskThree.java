package com.telran.prof.lessoons.hw.hw10;

import java.util.List;
import java.util.stream.Collectors;

public class TaskThree {

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "kiwi");

        List<Integer> collect = words.stream()
                .map(string -> string.length())
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
