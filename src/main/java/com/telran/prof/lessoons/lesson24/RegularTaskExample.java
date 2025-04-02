package com.telran.prof.lessoons.lesson24;

import java.util.regex.Pattern;

public class RegularTaskExample {

    public static void main(String[] args) {
        String original = "afHJK";
        String regex = "[a-zA-Z]*";

        System.out.println("Original contains regex " +
                Pattern.matches(regex, original));

        String original2 = "894";
        String regex2 = "\\d{3}"; //[0-9]

        System.out.println("Original contains regex " +
                Pattern.matches(regex2, original2));

        String original3 = "qwerty";
        String original4 = "qwe rty";

        String regex3 = "[a-z]{3}\\s?[a-z]{3}";

        System.out.println("Original contains regex " +
                Pattern.matches(regex3, original3));
        System.out.println("Original contains regex " +
                Pattern.matches(regex3, original4));
    }
}
