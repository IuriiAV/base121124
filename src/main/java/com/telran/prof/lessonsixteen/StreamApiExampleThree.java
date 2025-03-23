package com.telran.prof.lessonsixteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiExampleThree {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(35, "Max"),
                new Student(40, "Oleg"),
                new Student(25, "Alex"));

        Function<Student, String> convert = student -> student.getName();
        System.out.println(convert.apply(students.get(0)));
        List<String> names = new ArrayList<>();
        for (Student student : students) {
            names.add(convert.apply(student));
        }
        System.out.println(names);

        //map(Function)
        List<String> collectedNames = students.stream()
                .map(convert)
                .collect(Collectors.toList());
        System.out.println(collectedNames);

        // generate list ages , sorted
        List<Integer> ages = students.stream()
                .map(student -> student.getAge())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(ages);

        //use stream increase age by 5 and collect to list ages
        List<Student> studentsTwo = students.stream()
                .peek(student -> student.setAge(student.getAge() + 5))
                .collect(Collectors.toList());
        System.out.println(studentsTwo);

    }
}
