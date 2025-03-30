package com.telran.prof.lessons.lesson20;

public class ExceptionHandlerOptionThree {

    public static void main(String[] args) {
        try {
            printText(null);
        } catch (NullPointerException e) {
            System.out.println("Catch from print");
        }
    }

    private static void printText(String text) {
        printGeneratedText(text);

    }

    private static void printGeneratedText(String text) {
        System.out.println(text.length());
    }
}
