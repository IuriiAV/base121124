package com.telran.prof.lessonsixteen;

import java.util.Arrays;
import java.util.List;

/*
BigBen,
BigBob,
Big,
Ben,
Big Bob
 */
public class Task {

    public static void main(String[] args) {
        // count all words starts with "Big"
        List<String> words = Arrays.asList(
                "BigBen",
                "BigBob",
                "Big",
                "Ben",
                "Big Bob");
        long big = words.stream()
                .filter(string -> string.startsWith("Big"))
                .count();
        System.out.println(big);
    }
}
