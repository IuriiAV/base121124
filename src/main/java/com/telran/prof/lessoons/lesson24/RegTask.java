package com.telran.prof.lessoons.lesson24;

import java.util.SortedSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTask {

    public static void main(String[] args) {
        String text = "sdffksj fk j sdflskf sdl fk skkdf sd;flsdkf;sldkf ;sdl fk s;dflk";
        String regex = "fk";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("fk start from " + matcher.start() + " " +
                    "end to " + (matcher.end() - 1));

        }
        System.out.println("Total occurrences: " + count);
    }
}
