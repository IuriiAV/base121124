package com.telran.practice;

import java.util.HashSet;
import java.util.Set;

public class BookApp {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("one");
        stringSet.add("two");
        System.out.println("String set size " + stringSet.size());
        stringSet.add("two");
        System.out.println("String set size " + stringSet.size());

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("One"));
        bookSet.add(new Book("One"));
        System.out.println("Book set size " +bookSet.size());

    }
}
