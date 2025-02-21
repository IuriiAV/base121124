package com.telran.prof.lessons.homework.algoritms;

public class TaskReverse {

    public static void main(String[] args) {
        String text = "Hello Word!";
        System.out.println("Перевернутая строка: " + text + " = " + reverseText(text));
    }

    public static String reverseText(String text) {
        if (text.isEmpty() || text.length() == 1)
            return text;

        return text.charAt(text.length() - 1) + reverseText(text.substring(0, text.length() - 1));
    }
}
