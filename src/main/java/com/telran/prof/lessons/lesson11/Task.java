package com.telran.prof.lessons.lesson11;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task {

    public static void main(String[] args) {
        String[] words = {"student", "students", "dog", "cat", "elf", "flow", "wolf"};
        //1) вывести в консоль слова какой длины у нас есть
        // и какое количество слов каждой длины
        Map<Integer, Integer> map = new HashMap<>();
        for (String word : words) {
            int length = word.length();
            map.put(length, map.getOrDefault(length, 0) + 1);
        }

        map.forEach((key, value) -> {
            System.out.println("Слов длиной " + key + ": " + value + " шт.");
        });
        map.clear();

        Map<Integer, List<String>> newMap = new HashMap<>();
        for (String word : words) {
            int length = word.length();
            map.put(length, map.getOrDefault(length, 0) + 1);
        }

        map.forEach((key, value) -> {
            System.out.println("Слов длиной " + key  + ": " + value + " шт.");

        });




    }
}
