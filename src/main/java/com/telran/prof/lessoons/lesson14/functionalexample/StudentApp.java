package com.telran.prof.lessoons.lesson14.functionalexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentApp {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(25, "Alex"),
                new Student(28, "Hax"),
                new Student(15, "Max"),
                new Student(19, "Alan"));

        System.out.println(students);

        SortByAge sortByAge = new SortByAge();
        Collections.sort(students, sortByAge);

        System.out.println(students);

        Comparator<Student> byNameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Collections.sort(students, byNameComparator);
        System.out.println(students);

        Comparator<Student> byNameLambda = (o1, o2) -> o1.getName().compareTo(o2.getName());
        Collections.sort(students, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(students);
    }
}
