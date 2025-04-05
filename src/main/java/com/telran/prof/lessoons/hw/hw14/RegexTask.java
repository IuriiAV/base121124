package com.telran.prof.lessoons.hw.hw14;

import java.util.regex.Pattern;

public class RegexTask {

    public boolean checkIP(String ip) {
        if (ip == null || ip.isEmpty()) {
            return false;
        }
        return Pattern.matches("(25[0-5]|2[0-4]\\d|[0-1]\\d\\d|\\d?\\d)[.](25[0-5]|2[0-4]\\d|[0-1]\\d\\d|\\d?\\d)[.](25[0-5]|2[0-4]\\d|[0-1]\\d\\d|\\d?\\d)[.](25[0-5]|2[0-4]\\d|[0-1]\\d\\d|\\d?\\d)", ip);
    }
}
