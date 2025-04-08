package com.telran.prof.lessons.lesson8.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Comparable -> compareTo(< 0, 0 > 0) - натуральный порядок в классе объекта
 *
 * Comparator - compare(< 0, 0 > 0) - в отдельном классе с правилами сортировки
 */

public class PassportSortExample {

    public static void main(String[] args) {
        List<Passport> passports = Arrays.asList(
                new Passport(55555),
                new Passport(8560),
                new Passport(46317),
                new Passport(63532542),
                new Passport(1985));
        System.out.println("Before sort: " + passports);
        Collections.sort(passports);
        System.out.println("After sort: " + passports);
        Collections.sort(passports, Collections.reverseOrder());
        System.out.println("After sort: " + passports);


    }
}
