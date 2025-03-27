package com.telran.prof.lessontwentytwo;

import java.util.ArrayList;

public class GenericsExample {

    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // Object[]
        list.add("Hello");
        list.add("Java");
        //list.add(5);

        for (int i = 0; i < list.size(); i++) {
            Object value = list.get(i);  // Object[]
            String str = (String) value;  /// Runtime error
            System.out.println(str);
        }

        ArrayList<String> strings = new ArrayList<>(); //  Object[]
        //проверяй на этапе компиляции, что никто не положил в этот список
        //элемент типа, отличного от того, что указан в <>
        strings.add("Hello");
        ///strings.add(5);

        for (int i = 0; i < strings.size(); i++) {
            // Object value = strings.get(i); //  Object[]
            // String str = (String) strings.get(i);
            String str = strings.get(i);
            System.out.println(str);
        }
    }
}
