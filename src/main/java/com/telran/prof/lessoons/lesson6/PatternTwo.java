package com.telran.prof.lessoons.lesson6;

import java.util.ArrayList;
import java.util.List;

/**
 * Шаблон 2:
 * Есть список - отобрать все элементы, которые не подошли по условию
 * Фильтрация списка
 */

public class PatternTwo {

    public static void main(String[] args) {
        //ArrayList -> List
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("java");
        strings.add("sql");
        strings.add("other");
        strings.add(null);

        System.out.println("Original list " + strings);
        System.out.println("Modified list " + getFilteredList(strings, 5));

    }

    public static List<String> getFilteredList(List<String> strings, int length) {
        List<String> filteredList = new ArrayList<>();
        for (String value : strings) {
            if (value != null && value.length() == length) {
                filteredList.add(value);
            }
        }

        return filteredList;
    }
}
