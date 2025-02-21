package com.telran.prof.lessons.lesson6;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 25));
        students.add(new Student("Max", 55));
        students.add(new Student("Oleg", 21));
        students.add(new Student("Petr", 18));

        String age;
        System.out.println();
        addAge(students);
        System.out.println(students);
    }

    public static List<Student> getAge(List<Student> students, int age) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() >= 22) {
                filteredStudents.add(student);
            }
        }

        return filteredStudents;
    }

    public static void addAge(List<Student> students) {
        for (Student student : students) {
            student.setAge(student.getAge() + 2);
        }
    }

    public static List<Student> modifyAge(List<Student> students) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            Student studentUpdatedAge = new Student(student.getName(), student.getAge() + 2);
            filteredStudents.add(studentUpdatedAge);
        }

        return filteredStudents;
    }
}
