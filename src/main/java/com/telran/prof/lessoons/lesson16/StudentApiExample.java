package com.telran.prof.lessoons.lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentApiExample {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(35, "Max"),
                new Student(22, "Oleg"),
                new Student(25, "Alex"));

        List<String> strings = new ArrayList<>();
        for (Student student : students){
            strings.add(student.getName());
        }
        System.out.println(strings);

        List<String> stringsList = new ArrayList<>();
        Function<Student, String> getName = student -> student.getName();
        for(Student student : students) {
            stringsList.add(getName.apply(student));
        }
        System.out.println(stringsList);

        //map(Function)
        List<String> names = students.stream()
                .map(getName)
                .collect(Collectors.toList());
        System.out.println(names);

        List<Integer> ages = students.stream()
                .map(student -> student.getAge())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(ages);

        List<Student> newAges = students.stream()
                .peek(student -> student.setAge(student.getAge() + 5))
                .collect(Collectors.toList());
        System.out.println(students);
    }
}
