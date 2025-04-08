package com.telran.prof.lessons.lesson6;

import java.util.ArrayList;
import java.util.List;

public class PatternTwo {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hallo");
        strings.add("java");
        strings.add("sql");
        strings.add("other");
        strings.add(null);

        System.out.println("Original list " + strings);
        List<String> modifiedList = getFilteredList(strings, 5);
        System.out.println("Modified list " + modifiedList);
    }

    public static List<String> getFilteredList(List<String> strings, int length){
        List<String> filteredList = new ArrayList<>();
        for (String value : strings){
            if (value != null && value.length() == length){
                filteredList.add(value);
            }
        }
        return filteredList;
    }
}
