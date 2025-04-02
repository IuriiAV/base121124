package com.telran.prof.lessoons.lesson21.dublicator;

import java.util.Scanner;

public class DuplicatorApp {

    public static void main(String[] args) {
        String from = "/Users/kirasubotovskaa/IdeaProjects/base121124/src/main/java/com/telran/prof/lessoons/lesson21/InputOutputExample.java";
        String to = "/Users/kirasubotovskaa/IdeaProjects/base121124/src/main/java/com/telran/prof/lessoons/lesson21/dublicator/CopyClass.txt";
        System.out.println("How duplicate file : 1-StraightForward, 2-Reverse, 3-TransLiterator");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        Duplicator duplicator = null;
        switch (data) {
            case 1 -> duplicator = new StraightForwardDuplicator();
            case 2 -> duplicator = new ReverseDuplicator();
            //case 3 -> duplicator = new TransLiteratorDuplicator();
        }
        copyData(duplicator, from, to);
    }

    public static void copyData(Duplicator duplicator, String from, String to){
        duplicator.duplicate(from, to);
    }
}
