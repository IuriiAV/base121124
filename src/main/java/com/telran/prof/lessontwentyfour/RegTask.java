package com.telran.prof.lessontwentyfour;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTask {

    public static void main(String[] args) {
        String text = "sdffksj fk j sdflskf sdl fk skkdf sd;flsdkf;sldkf ;sdl fk s;dflk";
        String regex = "fk";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("fk start from " + matcher.start() + " " +
                    "end to " + (matcher.end() - 1));
        }
    }
}
