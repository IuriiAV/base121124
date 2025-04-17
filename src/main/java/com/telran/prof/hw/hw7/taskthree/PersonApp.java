package com.telran.prof.hw.hw7.taskthree;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonApp {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Alex", 22),
                new Person("Vlad", 43),
                new Person("George", 18),
                new Person("Max", 22),
                new Person("Leo", 23),
                new Person("Alex", 23));

        Collections.sort(personList, new PersonComparator());
        System.out.println(personList);
    }
}
