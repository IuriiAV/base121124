package com.telran.prof.lessons.lesson11;


import java.util.HashMap;
import java.util.Map;

/**
 * List, Set, Queue -> Collection хранят набор элементов
 * Map -> SortedMap -> NavigableMap -> TreeMap, LinkedHashMap, HashMap
 * Map - хранит набор пар элементов
 * Пара элементов: key -> value
 */
public class HashMapExample {

    public static void main(String[] args) {
        // key    ->  value
        // lemon  ->  100
        // apple  ->  50
        // banana ->  120
        // carrot ->  15
        Map<String, Integer> map = new HashMap<>();
        //put(key, value) - put element in map //Time complexity 0(1)
        map.put("Lemon", 100);
        map.put("Apple", 50);
        map.put("Banana", 120);
        map.put("Carrot", 15);
        //мы можем доставать значение по ключу
        //value = get(key)
        int value = map.get("Apple");
        System.out.println("Apple price is: " + value);
        //key - is unique, при попытке вставить значение по ключу, который уже
        //существует в мапе - значение, которое хранится в мапе по этому ключу - перезапишется

        System.out.println(map);
        map.put("Banana", 130);
        System.out.println(map);
        // HashMap - не поддерживает порядок!!!
        // HashMap - может иметь один null
        map.put(null, 100);
        System.out.println(map);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer pairValue = pair.getValue();
            System.out.println("Key = " + key + " value = " + pairValue);
        }

        System.out.println();
        map.forEach((k, v) -> {
            System.out.println("Key = " + k + " value = " + v);
        });
    }
}
