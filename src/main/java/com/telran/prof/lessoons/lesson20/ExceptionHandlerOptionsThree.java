package com.telran.prof.lessoons.lesson20;

public class ExceptionHandlerOptionsThree {

    public static void main(String[] args) {
        printText(null);
    }

    private static void printText(String text) {
        try {
            printGeneratedText(text);
        } catch (NullPointerException exception) {
            System.out.println("Catch from print");
        }

    }

    private static void printGeneratedText(String text) {
        System.out.println(text.length());
    }
}
