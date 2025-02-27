package com.telran.prof.lessonelleven;

import com.telran.homeworkprof.Homework2.Task1.SmartPhone;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * List , Set, Queue, <Collection> - хранят набор елементов
 * Map -> SortedMap , NavigableMap , ThreeMap, LinkedHashMap , HashMap
 * Map - хранит набор пар елементов
 * Пора элементов : key -> value;
 */
public class HashMapExample {

    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        map.put("Lemon" , 100);
        map.put("Apple" , 50);
        map.put("Banana" , 120);
        map.put("carrot" , 15);

        Integer value  = map.get("Apple");
        System.out.println("Apple price " + value);
        for(Map.Entry<String, Integer> pair: map.entrySet()){
            String key = pair.getKey();
            Integer pairValue = pair.getValue();
            System.out.println("Key = " + key + " value  = " + pairValue);
        }



    }
}
