package com.telran.prof.lessons.homework._06_02_25;

import java.util.TreeSet;

public class TaskTreeSetSort {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "kiwi"};
        TreeSet<String> sortedWords = new TreeSet<>();

        for (String word : words) {
            sortedWords.add(word);
        }

        for (String word : sortedWords)
            System.out.println(word);
    }
}
