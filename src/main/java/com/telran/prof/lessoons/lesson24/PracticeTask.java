package com.telran.prof.lessoons.lesson24;

import java.util.regex.Pattern;

public class PracticeTask {

    public static void main(String[] args) {
        System.out.println(checkNumber("1234567"));
        System.out.println(checkNumber("123 4567"));
        System.out.println(checkNumber("123-4567"));

    }
    public static boolean checkNumber(String number) {
        String regex = "\\d{3}[-\\s]?\\d{4}";
        return Pattern.matches(regex, number);
    }
}
