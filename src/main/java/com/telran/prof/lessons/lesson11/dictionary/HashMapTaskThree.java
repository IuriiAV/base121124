package com.telran.prof.lessons.lesson11.dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTaskThree {

    public static void main(String[] args) {
        String[] strings = {"student", "students", "dog", "cat", "elf", "flow", "wolf"};

        Map<Integer, List<String>> map = new HashMap<>();

        for (String string : strings){
            int length = string.length();
            List<String> stringsList = map.get(length);
            if (stringsList == null) {
                List<String> strings1 = new ArrayList<>();
                strings1.add(string);
                map.put(length, strings1);
            } else {
                stringsList.add(string);
            }
        }

        System.out.println(map);

    }
}
