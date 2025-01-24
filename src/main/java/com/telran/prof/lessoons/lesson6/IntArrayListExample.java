package com.telran.prof.lessoons.lesson6;

import java.util.ArrayList;

public class IntArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(45);
        integers.add(33322);
        integers.add(1);
        System.out.println(integers);
        System.out.println("Size list is " + integers.size());

        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) + " ");
        }

        System.out.println();

        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }

        //Time complexity 0(n)
        //contains - check that element exists in list
        System.out.println("Is there 45 ? " + integers.contains(45));
    }
}
