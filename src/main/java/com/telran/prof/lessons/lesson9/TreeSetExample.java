package com.telran.prof.lessons.lesson9;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet - сортирует коллекцию и не поддерживает дубли
 */
public class TreeSetExample {

    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("A"); //добавить
        stringSet.add("C");
        stringSet.add("E");
        stringSet.add("F");
        stringSet.add("D");
        stringSet.add("A");

        System.out.println(stringSet);
        System.out.println("Set contains F " + stringSet.contains("F"));
        System.out.println("Set contains G " + stringSet.contains("G"));
        stringSet.remove("D"); //удалить

        for(String element : stringSet) {
            System.out.print(element + " ");
        }

    }
}
