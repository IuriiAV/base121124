package com.telran.prof.lessons.lesson9;

import java.util.HashSet;
import java.util.Set;

public class TaskExample {

    public static void main(String[] args) {
        String text = "ndbfmsabfamndfbsmdnfbmfbwjehfbwjefbansdmfd";
        //вывести в консоль все уникальные символы из этой строки
        //и вывести их количество
        System.out.println(text.length());
        Set<Character> characterSet = new HashSet<>();

        for (int i = 0; i < text.length() - 1; i++) {
            characterSet.add(text.charAt(i));
        }
        System.out.println("Letters in set " + characterSet);
        System.out.println("Size of our set " + characterSet.size());
    }
}
