package com.telran.prof.lessonseven;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListVSLinkedList {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        System.out.println("It takes " + (endTime - startTime));
    }

    public static void fillList(List<Integer> list) {
        Random random = new Random();
            int value = random.nextInt(500);
        }
    }
}
