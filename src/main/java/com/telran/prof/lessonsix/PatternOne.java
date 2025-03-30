package com.telran.prof.lessonsix;

import java.util.ArrayList;
import java.util.List;

/**
 * Шаблон 1:
 * Есть список элементов, и нужно перебрать все элементы и изменить их значение на новое
 * Либо вернуть новый список либо сделать это в текущем
 */
public class PatternOne {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("java");
        strings.add("sql");
        strings.add("other");

        System.out.println("Original list " + strings);
        ArrayList<String> modifiedList = getModifiedList(strings);
        System.out.println("Modified list " + modifiedList);

        modifyList(strings);
        System.out.println("Modified list " + strings);
    }

    public static ArrayList<String> getModifiedList(ArrayList<String> list) {
        ArrayList<String> modifiedList = new ArrayList<>();
        for (String value : list) {
            String upperCase = value.toUpperCase();
            modifiedList.add(upperCase);
        }

        return modifiedList;
    }

    public static List<String> getModifiedList(List<String> list) {
        List<String> modifiedList = new ArrayList<>();
        for (String value : list) {
            String upperCase = value.toUpperCase();
            modifiedList.add(upperCase);
        }

        return modifiedList;
    }

    public static void modifyList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String value = list.get(i);
            String upperCase = value.toUpperCase();
            list.set(i, upperCase);
        }
    }
}
