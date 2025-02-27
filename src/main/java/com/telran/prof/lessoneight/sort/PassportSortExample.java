package com.telran.prof.lessoneight.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Comparable -> compareTo (<0,0,>0) натуральный порядок , в классе объекта
 * <p>
 * Comparator - compare (<0,0,>0) - в отдельном классе с правилами сортировки
 */
public class PassportSortExample {

    public static void main(String[] args) {
        List<Passport> passports = Arrays.asList(
                new Passport(555535),
                new Passport(3453),
                new Passport(34534565),
                new Passport(7867868),
                new Passport(432344));
        System.out.println("Before sort : " + passports);
        Collections.sort(passports);
        System.out.println("After sort : " + passports);
        Collections.sort(passports, Collections.reverseOrder());
        System.out.println("After sort : " + passports);


    }
}
