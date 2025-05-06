package com.telran.prof.hw.hw6;

import java.util.Set;
import java.util.TreeSet;

public class TaskOne {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "kiwi" };

        Set<String> stringSet = new TreeSet<>();

        for (String word : words) {
            stringSet.add(word);
        }
        for (String word : stringSet) {
            System.out.println(word);
        }
    }
}
