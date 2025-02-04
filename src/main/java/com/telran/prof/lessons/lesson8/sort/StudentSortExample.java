package com.telran.prof.lessons.lesson8.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Comparator - compare (< 0, 0, > 0)
 */

public class StudentSortExample {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alex", 20),
                new Student("Oleg", 15),
                new Student("Max", 25),
                new Student("Egor", 50),
                new Student("Petr", 18));

        System.out.println(students);
        SortStudentByAge sortStudentByAge = new SortStudentByAge();

        Collections.sort(students, sortStudentByAge);
        System.out.println("After sort by age " + students);

        Collections.sort(students, new SortStudentByName());
        System.out.println("After sort by name " + students);


        Student[] studentsArr = {
                    new Student("Alex", 20),
                    new Student("Oleg", 15),
                    new Student("Max", 25),
                    new Student("Egor", 50),
                    new Student("Petr", 18)};
        Arrays.sort(studentsArr, sortStudentByAge);
        System.out.println(Arrays.toString(studentsArr));
    }
}
