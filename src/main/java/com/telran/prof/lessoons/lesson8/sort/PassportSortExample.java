package com.telran.prof.lessoons.lesson8.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PassportSortExample {

    public static void main(String[] args) {
        List<Passport> passports = Arrays.asList(
                new Passport(78546596),
                new Passport(76857659),
                new Passport(44444444),
                new Passport(754655696),
                new Passport(34343443),
                new Passport(543234567));
        System.out.println("Passports before sort " + passports);
        Collections.sort(passports);
        System.out.println("Passports after sort " + passports);
        Collections.sort(passports, Collections.reverseOrder());
        System.out.println("Passports after sort " + passports);
    }
}
