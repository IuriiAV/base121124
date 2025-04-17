package com.telran.prof.lessoons.hw.hw10;

import java.util.List;
import java.util.stream.Collectors;

public class TaskFour {

    public static void main(String[] args) {
        List<String> words = List.of("Java", "Stream", "API");

        String collect = words.stream()
                .collect(Collectors.joining(", "));
        System.out.println(collect);
    }
}
