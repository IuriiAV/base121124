package com.telran.prof.lessonseven;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListVSLinkedList {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedlist = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        //fillList(arrayList);
        long endTime = System.currentTimeMillis();
        fillList(linkedlist);
        System.out.println("It takes " + (endTime - startTime));
    }

    public static void fillList(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int value = random.nextInt(500);
            list.add(0,value);
        }
    }
}
