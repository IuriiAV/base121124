package com.telran.prof.lessons.lesson13.hwtask;

import java.util.ArrayList;
import java.util.List;

public class HalfExampleApp {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        strings.add("Five");
        strings.add("Six");

        HalfIterator halfIterator = new HalfIterator(strings);
        while (halfIterator.hasNext()){
            System.out.println(halfIterator.next());
        }
    }
}
