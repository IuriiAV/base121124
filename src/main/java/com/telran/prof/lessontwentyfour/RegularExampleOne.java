package com.telran.prof.lessontwentyfour;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExampleOne {

    public static void main(String[] args) {
        String regex = "www"; //
        String original = "www 375637hgjfs.te www lran.de";

        Pattern pattern = Pattern.compile(regex);
        boolean matches = pattern.matcher(original).matches();
        System.out.println(" original string contains " + matches);

        System.out.println("Original contains " + Pattern.matches(regex, original));

        Matcher matcher = pattern.matcher(original);
        while (matcher.find()) {
            System.out.println("www start from " + matcher.start() + " " +
                    "end to " + (matcher.end() - 1));
        }

    }
}
