package com.telran.prof.lessoneight;

import java.util.ArrayList;
import java.util.List;

public class SearchExample {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");

        System.out.println(strings.contains("Two"));
    }
}
