package com.telran.prof.lessoneleven;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * List, Set, Queue -> Collection хранят набор элементов
 * Map -> SortedMap ->NavigableMap -> TreeMap, LinkedHashMap, HashMap
 * Map - хранит набор пар элементов
 * Пара элементов: key -> value
 */
public class HashMapExample {

    public static void main(String[] args) {
        // key   -> value
        // lemon -> 100
        // apple -> 50
        // banana-> 120
        // carrot -> 15

        Map<String, Integer> map = new HashMap<>();
        //put(key,value) - put element in map Time complexity O(1)
        map.put("lemon", 100);
        map.put("apple", 50);
        map.put("banana", 120);
        map.put("carrot", 15);

        //мы можем доставать значение по ключу
        //value = get(key); Time complexity O(1)
        Integer value = map.get("apple");
        System.out.println("Apple price is " + value);

        List<Fruit> fruits = Arrays.asList(
                new Fruit("lemon", 100),
                new Fruit("apple", 50),
                new Fruit("banana", 120),
                new Fruit("carrot", 15));

        for (Fruit fruit : fruits) {
            if ("apple".equals(fruit.getTitle())) {//Time complexity O(n)
                System.out.println("Apple price is " + fruit.getPrice());
            }
        }

        //key - is unique, при попытке вставить значение по ключу, который уже
        //существует в мапе - значение, которое хранится в мапе по этому ключу - перезапишется

        System.out.println(map);
        map.put("banana", 20);
        System.out.println(map);
        //HashMap - не поддерживает порядок!!!
        //HashMap - может иметь один null ключ
        map.put(null, 100);
        System.out.println(map);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer pairValue = pair.getValue();
            System.out.println("Key = " + key + " value = " + pairValue);
        }

        map.forEach((k, v) -> {
            System.out.println("Key = " + k + " value = " + v);
        });

        //проверка, что запись с таким ключом существует
        boolean isExists = map.containsKey("apple"); // Time complexity O(1)
    }
}
