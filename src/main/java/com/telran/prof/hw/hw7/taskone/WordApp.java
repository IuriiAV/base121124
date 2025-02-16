package com.telran.prof.hw.hw7.taskone;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordApp {

    public static void main(String[] args) {
        List<Word> words = Arrays.asList(new Word("apple"), new Word("kiwi"), new Word("banana"));

        Collections.sort(words);

        for (Word word : words) {
            System.out.println(word);
        }
    }
}
