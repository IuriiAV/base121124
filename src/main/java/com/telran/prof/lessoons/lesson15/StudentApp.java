package com.telran.prof.lessoons.lesson15;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StudentApp {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(703985, "James", "Anderson"),
                new Student(763489, "Emily", "Carter"),
                new Student(198364, "Michael", "Johnson"),
                new Student(347923, "Sophia", "Bennett"),
                new Student(628495, "William", "Parker"),
                new Student(578204, "Olivia", "Mitchell"),
                new Student(563930, "Daniel", "Harris"),
                new Student(567493, "Emma", "Collins"),
                new Student(769304, "Alexander", "Scott"),
                new Student(145895, "Charlotte", "Evans"));

        System.out.println(converter(students));

        System.out.println(studentsGenerator());
    }

    private static List<Student> studentsGenerator() {
        List<Student> generatedStudents = new ArrayList<>();
        Faker faker = new Faker();
        StudentGenerator studentGenerator = ((id, name, surname) -> new Student(id, name, surname));
        for (int i = 0; i < 10; i++) {
            Student student = studentGenerator.createStudent(faker.number().numberBetween(3, 6), faker.name().firstName(), faker.name().lastName());
            generatedStudents.add(student);
        }
        return generatedStudents;
    }

    private static List<Integer> converter(List<Student> students) {
        List<Integer> filteredStudents = new ArrayList<>();
        Function<Student, Integer> filter = (a) -> a.getId();

        for (Student student : students) {
            Integer apply = filter.apply(student);
            filteredStudents.add(apply);
        }
        return filteredStudents;
    }
}
