package com.telran.prof.lessoons.lesson11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTaskThree {

    public static void main(String[] args) {
        String[] strings = {"student", "students", "dog", "cat", "elf",
                "flow", "wolf" };

        Map<Integer, List<String>> map = new HashMap<>();

        for (String string : strings) {
            map.put(string.length(), null);
        }

        for (int i = 0; i < strings.length; i++) {
            List<String> stringList = new ArrayList<>();

        }
    }
}
