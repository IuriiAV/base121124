package com.telran.prof.lessons.lesson6;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

    public static void main(String[] args) {
        //String[] st = new String[10];
        ArrayList<String> list = new ArrayList<>();
        //st[0] = "one";

        //add - add element to list;
        //add(index, value) - add element by index
        //list.add(0, "one");
        //st[0] = ..., st[1] = ..., etc

        //add(value) - add element to end of the list
        list.add("one");
        list.add("two");
        list.add("three");

        //System.out.println(Arrays.toString(st));
        System.out.println(list);

        //String str = st[0];
        //get(index) - get element from list by index
        String one = list.get(0);
        System.out.println("Element by index 0 is " + one);

        list.add("one");   //3
        list.add("two");   //4
        list.add("three"); //5
        list.add("one");   //6
        list.add("two");   //7
        list.add("three"); //8
        list.add("one");   //9
        list.add("two");   //10
        list.add("three"); //11
        list.add("one");   //12
        list.add("two");   //13
        list.add("three"); //14
        System.out.println(list);
        System.out.println("Element by index 12 is " + list.get(12));

        //Time complexity 0(1) - постоянное время
        //add(value) - add value to the end of array
        //["one", "two", "three", null, null, null, null]
        //add("six")
        //["one", "two", "three", "six", null, null, null]

        //Time complexity 0(1) - постоянное время
        //get(index) - add by index

        //Time complexity 0(n) - линейное время
        //add(index, value) - add by index
        //["one", "two", "three", "six", null, null, null]
        //add(0, "Hallo")
        //["Hallo", "one", "two", "three", "six", null, null]

        System.out.println(list);
        list.add(0, "Hello");
        System.out.println(list);

        //Time complexity 0(1) - постоянное время
        //set(index, value) - set element by index
        list.set(2, "Bye");
        System.out.println(list);

        //Time complexity 0(n) - линейное время
        //remove(index), remove(value)
        //["Hallo", "one", "two", "three", "six", null, null, null]
        //remove(2)
        //["Hallo", "one", "three", "six", null, null, null, null]
        list.remove(1);
        System.out.println(list);
        list.remove("one");
        System.out.println(list);
    }
}
