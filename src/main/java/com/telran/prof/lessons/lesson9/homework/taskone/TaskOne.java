package com.telran.prof.lessons.lesson9.homework.taskone;

import java.util.SortedSet;
import java.util.TreeSet;

public class TaskOne {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "kiwi"};

        SortedSet<String> treeSet = new TreeSet<>();

        for (int i = 0; i < words.length; i++) {
            treeSet.add(words[i]);
        }
        for (String word : treeSet){
            System.out.println(word);
        }

    }
}
