package com.telran.prof.lessonfourteen.functionalexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentApp {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(25, "Alex"),
                new Student(21, "Max"),
                new Student(55, "Alan"));

        System.out.println("Before sort " + students);

        SortByAge sortByAge = new SortByAge();
        Collections.sort(students, sortByAge);

        System.out.println("After age sort " + students);

        Comparator<Student> byNameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Comparator<Student> lambdaByName = (o1, o2) -> o1.getName().compareTo(o2.getName());

        Collections.sort(students, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("After name sort " + students);
    }
}
