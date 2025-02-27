package com.telran.prof.lessonsix;

import java.util.ArrayList;

public class IntArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(115);
        integers.add(33);
        integers.add(334);
        integers.add(1);
        System.out.println(integers);
        System.out.println("Size list is " + integers.size());

        for(int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) + " ");
        }
        System.out.println();

        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
        System.out.println();

        //Time complexity O(n)
        //contains - check that element exists in list
        System.out.println("Is there 334 ? " + integers.contains(334));
    }
}
