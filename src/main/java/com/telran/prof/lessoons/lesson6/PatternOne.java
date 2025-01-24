package com.telran.prof.lessoons.lesson6;

import java.util.ArrayList;

/**
 * Шаблон 1:
 * Есть список элементов, и нужно перебрать все элементы и изменить их значения на новые
 * Либо вернуть новый список либо сделать это в текущем
 */

public class PatternOne {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("java");
        strings.add("sql");
        strings.add("other");

        System.out.println("Original list : " + strings);
        System.out.println("Modified list : " + getModifiedList(strings));
        modifyList(strings);
    }

    public static ArrayList<String> getModifiedList(ArrayList<String> list) {
        ArrayList<String> modifiedList = new ArrayList<>();
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
            list.set(i,upperCase);
        }
    }
}
