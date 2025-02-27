package com.telran.prof.lessonnine;

import java.util.HashSet;
import java.util.Set;

public class TaskExample {

    public static void main(String[] args) {
        String text = "ndbfmsabfamndfbsmdnfbmfbwjehfbwjefbansdmfd";
        // вывести в консоль все уникальние сымволы в консоль
        Set<Character> stringSet = new HashSet<>();
        for (int i = 0; i < text.length() ; i++) {
            char c = text.charAt(i);
            stringSet.add(c);
        }
        System.out.println("Unical letters : " + stringSet);
        System.out.println("size : "+stringSet.size());
    }
}
