package com.telran.prof.lessoneight.Sort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Comperable -> comperable (<0 , 0 , 0>) натуральний порядок , в классе объектов
 *
 * Comparetor -> compare  <0 , 0 , 0>) в оттельном классе с правилами сортировки
 */
public class PassportSortExample {

    public static void main(String[] args) {
        List<Passport> passports = Arrays.asList(
                new Passport(6546544),
                new Passport(658544),
                new Passport(65463454),
                new Passport(6444),
                new Passport(6546544),
                new Passport(65244)
        );
        System.out.println("Before sort : " + passports);
        Collections.sort(passports);
        System.out.println("After sort : " + passports);
        Collections.sort(passports,Collections.reverseOrder());
        System.out.println("After sort an another side : " + passports);
    }
}
