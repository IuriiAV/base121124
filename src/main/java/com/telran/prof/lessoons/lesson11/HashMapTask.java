package com.telran.prof.lessoons.lesson11;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask {

    public static void main(String[] args) {
        String text = "fcvgbhnjmklfjnvkjfdnvjfnvjfkvnjfdvkfjvffdjnvkjdfnvkjndfv";
        Map<Character, Integer> map = new HashMap<>();
        int ints = 0;

        System.out.println("Option 1 : ");
        //Option 1
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            Integer count = map.get(temp);
            if (count == null) {
                map.put(temp, 1);
            } else {
                map.put(temp, count += 1);
            }
        }
        map.forEach((k, v) -> {
            System.out.println("Letter " + k + ", exists " + v + " times");
        });

        System.out.println("\nOption 2 : ");
        //Option 2
        map.clear(); //очистка мапы
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            boolean result = map.containsKey(temp); //проверка что ключ есть // O(1)
            if (result) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        map.forEach((k, v) -> {
            System.out.println("Letter " + k + ", exists " + v + " times");
        });

        System.out.println("\nOption 3 : ");
        //Option 3
        map.clear(); //очистка мапы
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            //получает значение по ключу и если ключ есть в мапе, то возвращает
            //значение по этому ключу, если ключа нет, то возвращает значение которое
            //указано как дефолтное
            Integer value = map.getOrDefault(temp, 0);
            map.put(temp, value + 1);
        }
        map.forEach((k, v) -> {
            System.out.println("Letter " + k + ", exists " + v + " times");
        });
    }
}
