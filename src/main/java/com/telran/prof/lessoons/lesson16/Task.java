package com.telran.prof.lessoons.lesson16;

import java.util.Arrays;
import java.util.List;

public class Task {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");
        long big = words.stream()
                .filter(string -> string.startsWith("Big"))
                .count();
        System.out.println(big);
    }
}
