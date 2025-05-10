package com.telran.prof.lessons.lesson8.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentSortExample {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("ALex", 20),
                new Student("Oleg", 15),
                new Student("Max", 25),
                new Student("Egor", 50),
                new Student("Petr", 18)
        );

        System.out.println("Students before sort " + students);
        SortByAge sortByAge = new SortByAge();

        Collections.sort(students, sortByAge);
        System.out.println("Students after sort by age " + students);

        Collections.sort(students, new SortByName());
        System.out.println("Students after sort by name " + students);

        Student[] stringsArr = {
                new Student("ALex", 20),
                new Student("Oleg", 15),
                new Student("Max", 25),
                new Student("Egor", 50),
                new Student("Petr", 18)
        };
        Arrays.sort(stringsArr, sortByAge);
        System.out.println(Arrays.toString(stringsArr));
    }
}
