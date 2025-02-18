package com.telran.prof.lessons.lesson9;

import java.util.HashSet;
import java.util.Set;

public class TaskExample {

    public static void main(String[] args) {
        String text = "ndbfmsabfamndfbsmdnfbmfbwjehfbwjefbansdmfd";
        //вывести все уникальные символы из этой строки
        //и вывести их количество

        Set<Character> characterSet = new HashSet<>();

        for (int i = 0; i < text.length(); i++) {
            char charAt = text.charAt(i);
            characterSet.add(charAt);
        }
        System.out.println("Letters in set: " + characterSet);
        System.out.println("Size of set: " + characterSet.size());
    }
}
