package com.telran.prof.lessoons.lesson11;

import java.util.HashMap;
import java.util.Map;

public class HashMapTaskTwo {

    public static void main(String[] args) {
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
