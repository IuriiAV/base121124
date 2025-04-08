package com.telran.prof.lessons.lesson9;


import java.util.*;

/**
 * HashSet - набор уникальных элементов, без какого либо порядка
 * ("Мешок уникальных элементов" - на собесе не говорить про мешок)
 *
 * add, remove, contains - 0(1)
 * (в случае корректной реализации хешкода)
 */
public class HashSetExample {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("A");
        stringSet.add("C");
        stringSet.add("F");
        stringSet.add("D");
        stringSet.add("A");
        stringSet.add("e");

        System.out.println(stringSet);
        System.out.println("Set contains F " + stringSet.contains("F"));

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(4);
        integerSet.add(2);
        integerSet.add(-7);
        integerSet.add(9);
        integerSet.remove(9);
        System.out.println(integerSet);


    }
}
