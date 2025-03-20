package com.telran.prof.lessontwentyone.duplicator;

import java.util.Scanner;

public class DuplicatorApp {

    public static void main(String[] args) {
        String from = "/Users/iurii/Downloads/base121124/src/main/java/com/telran/prof/lessontwentyone/InputOutputExample.java";
        String to = "/Users/iurii/Downloads/base121124/src/main/java/com/telran/prof/lessontwentyone/duplicator/CopyClass.txt";
        System.out.println("How duplicate file : 1-StraightForward, 2-Reverse");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        Duplicator duplicator = null;
        switch (data) {
            case 1 -> duplicator = new StraightForwardDuplicator();
            case 2 -> duplicator = new ReverseDuplicator();
        }
        copyData(duplicator, from, to);
    }

    public static void copyData(Duplicator duplicator, String from, String to) {
        duplicator.duplicate(from, to);
    }
}
