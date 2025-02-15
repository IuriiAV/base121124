package com.telran.prof.lessons.lesson8.hw.taskone;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordApp {

    public static void main(String[] args) {
        List<Word> words = Arrays.asList(
                new Word("apple"),
                new Word("kiwi"),
                new Word("banana"));

        System.out.println(words);
        sortWords(words);
        System.out.println(words);
    }

    public static void sortWords(List<Word> words) {
        Collections.sort(words);
    }
}
