package com.telran.prof.lessons.lesson10.queueexample;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

    public static void main(String[] args) {
        Deque<String> stringDeque = new ArrayDeque<>();
        stringDeque.add("one");
        stringDeque.add("two");
        stringDeque.add("three");

        while (!stringDeque.isEmpty()) {
            System.out.print(stringDeque.poll() + " ");
        }
    }
}
