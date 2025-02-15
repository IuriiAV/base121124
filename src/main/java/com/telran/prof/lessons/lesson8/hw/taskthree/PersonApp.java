package com.telran.prof.lessons.lesson8.hw.taskthree;

import com.telran.prof.lessons.lesson8.sort.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonApp {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alex", 20),
                new Person("Oleg", 15),
                new Person("Max", 20),
                new Person("Egor", 50),
                new Person("Petr", 18));

        System.out.println(persons);
        sortPerson(persons);
        System.out.println(persons);

    }

    public static void sortPerson(List<Person> persons) {
        Collections.sort(persons, new PersonComparator());
    }
}
