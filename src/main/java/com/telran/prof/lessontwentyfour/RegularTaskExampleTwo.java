package com.telran.prof.lessontwentyfour;

import java.util.regex.Pattern;

public class RegularTaskExampleTwo {

    public static void main(String[] args) {
        String original = "dsadfsdfDGFDGf";
        String regex = "[a-zA-Z]*";

        String original2 = "894";

        String regex2 = "[0-9]{3}";  //[0-9]  \\d
        System.out.println(Pattern.matches(regex2,original2));


        System.out.println("Original contains regex " +
                Pattern.matches(regex, original));

        String original3 = "qwerty";
        String original4 = "qwe rty";

        String regex3 = "[a-z]{3}\\s?[a-z]{3}";

        System.out.println(Pattern.matches(regex3,original3));
        System.out.println(Pattern.matches(regex3,original4));

    }
}
