package com.telran.prof.lessons.lesson6;

import java.util.ArrayList;

/**
 * ArrayList - dynamic array (динамический класс) - это динамический массив, его размер
 * увеличивается тогда, когда нам это нужно(автоматически при заполнении)
 */
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println(list);
    }
}
