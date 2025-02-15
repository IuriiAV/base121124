package com.telran.prof.lessons.lesson11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeTaskExample {

    public static void main(String[] args) {
        String[] words = {"student", "students", "dog", "cat", "elf", "flow", "wolf"};
        //1) вывести в консоль слова какой длины у нас есть
        // и какое количество слов каждой длины

        Map<String, Integer> mapLength = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            Integer value = mapLength.getOrDefault(words[i],words[i].length());
            System.out.println("Word " + words[i] + " long " + value);
        }
        Map<String, Integer> mapKol = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            Integer value = mapKol.getOrDefault(words[i], words.length);
        }

        String[] strings = {"student", "students", "dog", "cat", "elf",
                "flow", "wolf" };
        //1) вывести в консоль слова какой длины у нас есть
        // и какое количество слов каждой длины
        Map<Integer, Integer> map = new HashMap<>();

        for (String string : strings) {
            map.put(string.length(), map.getOrDefault(string.length(), 0) + 1);
        }

        map.forEach((l,k) -> {
            System.out.println("The word with " + l + " letters we meet " + k + " times");
        });






    }
}
