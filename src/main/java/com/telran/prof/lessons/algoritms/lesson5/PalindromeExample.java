package com.telran.prof.lessons.algoritms.lesson5;

public class PalindromeExample {
    //https://github.com/IuriiAV/algoevening
    public static void main(String[] args) {
        String text = "racecar";
        String str = "abeccdeba";
        System.out.println("Is palindrome 'abeccdeba'? " + isPalindrome(str));
        System.out.println("Is palindrome 'racecar'? " + isPalindrome(text));
    }

    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            char l = text.charAt(left);
            char r = text.charAt(right);
            if (l == r) {
                left++;
                right--;
            } else
                return check(text, left + 1, right) || check(text, left, right - 1);
        }
        return true;
    }

    public static boolean check(String text, int left, int right) {
        while (left < right) {
            if (text.charAt(left++) != text.charAt(right--))
                return false;
        }
        return true;
    }
}
