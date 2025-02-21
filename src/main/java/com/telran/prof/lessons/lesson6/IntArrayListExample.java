package com.telran.prof.lessons.lesson6;

import java.util.ArrayList;

public class IntArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(115);
        integers.add(5);
        integers.add(1);
        integers.add(15);
        System.out.println(integers);
        System.out.println("Size list is: " + integers.size());
    }
}
