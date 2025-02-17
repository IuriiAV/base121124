package com.telran.prof.lessons.homework.algoritms;

import java.util.Locale;

public class TaskPalindrome {

    public static void main(String[] args) {
        String text = "А роза упала на лапу Азора";
        System.out.println("Строка \"" + text + "\" является палиндромом? " + isPalindrome(text));
    }

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\s", "").toLowerCase(Locale.ROOT);
        return isPalindromeTru(text, 0, text.length() - 1);
    }

    public static boolean isPalindromeTru(String text, int l, int r) {
        if (l >= r)
            return true;

        if (text.charAt(l) != text.charAt(r))
            return false;

        return isPalindromeTru(text, l +1, r - 1);
    }
}
