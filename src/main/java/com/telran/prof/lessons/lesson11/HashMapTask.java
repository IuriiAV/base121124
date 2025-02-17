package com.telran.prof.lessons.lesson11;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask {

    public static void main(String[] args) {
        String text = "asdasdfaslkdfjalasdfhakshfqweoirutqy";

        System.out.println("Option 1");
        //optional 1
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            Integer count = map.get(temp);
            if (count == null) {
                map.put(temp, 1);
            } else {
                count++;
                map.put(temp, count);
            }
        }

        map.forEach((key, value) -> {
            System.out.println("Letter " + key + ", exists " + value + " times");
        });
        System.out.println("Option 2");
        //optional 2
        map.clear(); //очистка мапы

        map.clear(); // очистка мапы
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            boolean result = map.containsKey(temp); // проверка что ключ есть // O(1)
            if (result) {
                Integer count = map.get(temp);
                map.put(temp, count + 1);
            } else {
                map.put(temp, 1);
            }
        }
        map.forEach((key, value) -> {
            System.out.println("Letter " + key + ", exists " + value + " times");
        });


        //Option 3
        map.clear();
        System.out.println("Option 3");
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            //получает значение по ключу, если ключ есть в мапе, то возвращает
            //значение по этому ключу, если ключа нет, то возвращает значение, которое
            //указано как default
            Integer value = map.getOrDefault(temp, 0);
            map.put(temp, value + 1);
        }
        map.forEach((key, value) -> {
            System.out.println("Letter " + key + ", exists " + value + " times");
        });
    }
}
