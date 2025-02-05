package com.telran.prof.lessoons.lesson8.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Comparator - compare (<0,0,>0)
 */

public class StudentApp {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alex", 20),
                new Student("Oleg", 16),
                new Student("Max", 25),
                new Student("Egor", 19),
                new Student("Petr", 21));

        System.out.println("Students before sort " + students);
        SortStudentByAge sortStudentByAge = new SortStudentByAge();

        Collections.sort(students, sortStudentByAge);
        System.out.println("Students after sort " + students);

        Collections.sort(students, new SortStudentByName());
        System.out.println("Students after sort by name " + students);

        Student[] studentsArr = {new Student("Alex", 20),
                new Student("Oleg", 16),
                new Student("Max", 25),
                new Student("Egor", 19),
                new Student("Petr", 21)};
        Arrays.sort(studentsArr, new SortStudentByName());
        System.out.println(studentsArr);
        Arrays.sort(studentsArr, sortStudentByAge);
        System.out.println(studentsArr);
    }
}
