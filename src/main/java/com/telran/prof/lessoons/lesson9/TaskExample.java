package com.telran.prof.lessoons.lesson9;

import java.util.HashSet;
import java.util.Set;

public class TaskExample {

    public static void main(String[] args) {
        String text = "ndbfmsabfamndfbsmdnfbmfbwjehfbwjefbansdmfd";
        Set<Character> stringSet = new HashSet<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            stringSet.add(c);
        }

        System.out.println("Letters in set " + stringSet);
        System.out.println("Size of our set " + stringSet.size());
    }
}
