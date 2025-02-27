package com.telran.prof.lessonnine;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * treeset -сортирует коллекцию и поддержывает ее в уникальном состояние
 * не поддерживает дубли
 * add , remove, contains - 0(logn)
 */
public class TreeSetExample {

    public static void main(String[] args) {
        SortedSet<String> stringSet = new TreeSet<>();
        stringSet.add("a");
        stringSet.add("c");
        stringSet.add("f");
        stringSet.add("d");
        stringSet.add("a");

        System.out.println(stringSet);
        System.out.println("Set contains g " + stringSet.contains("g"));
        stringSet.remove("a");
        System.out.println(stringSet);

        for (String element : stringSet) {
            System.out.println(element);
        }
        System.out.println("First" + " " + stringSet.first());
        System.out.println("Last " + stringSet.last());

        Set<Integer> setInteger = new TreeSet<>();
        setInteger.add(5);
        setInteger.add(3);
        setInteger.add(1);
        setInteger.add(66);

        System.out.println(setInteger);
    }
}
