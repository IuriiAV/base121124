package com.telran.prof.lessoons.lesson7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListVSLinkedList {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        //1 Jan 1970 03-00
        long startTime = System.currentTimeMillis();
        fillList(linkedList);
        long endTime = System.currentTimeMillis();
        System.out.println("It takes " + (endTime - startTime));

        //fillList(linkedList);
    }

    public static void fillList(List<Integer> list) {
        Random random = new Random();
        for(int i = 0; i < 1000000; i++) {
            int value = random.nextInt(500);
            list.add(value);
        }
    }
}
