package com.telran.prof.lessoneleven;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("lemon", 100);
        map.put("apple", 50);
        map.put("banana", 120);
        map.put("carrot", 15);

        System.out.println(map);
    }
}
