package com.telran.prof.lessoons.lesson24;

import java.util.regex.Pattern;

public class HomeTask {

    public boolean checkIP(String ip) {
        String regex = "\\d{1,3}[.]\\d{1,3}[.]\\d{1,3}[.]\\d{1,3}";
        if (Pattern.matches(regex, ip)) {
            System.out.println("Your ip is correct");
            return true;
        }
        System.out.println("Your ip is incorrect");
        return false;
    }
}
