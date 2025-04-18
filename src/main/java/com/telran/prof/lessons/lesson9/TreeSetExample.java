package com.telran.prof.lessons.lesson9;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * TreeSet - сортирует коллекцию и не поддерживает дубли
 * add, remove, contains - 0(log n)
 */

public class TreeSetExample {

    public static void main(String[] args) {
        SortedSet<String> stringSet = new TreeSet<>();
        stringSet.add("A");
        stringSet.add("C");
        stringSet.add("F");
        stringSet.add("D");
        stringSet.add("A");

        System.out.println(stringSet);
        System.out.println("Set contains F " + stringSet.contains("F"));
        stringSet.remove("D");

        for (String element : stringSet) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("First " + stringSet.first());
        System.out.println("Last " + stringSet.last());
    }
}
