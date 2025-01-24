package com.telran.prof.lessoons.lesson6;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 24));
        students.add(new Student("Max", 22));
        students.add(new Student("Mark", 19));
        students.add(new Student("Oleg", 20));

        //Написать метод который вернет список студентов с возрастом больше 22

        System.out.println(getStudentsByAge(students, 22));
        modifyAge(students);
    }

    public static List<Student> getStudentsByAge(List<Student> students, int age) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() >= age) {
                filteredStudents.add(student);
            }
        }

        return filteredStudents;
    }

    //написать метод который увеличит возраст на 2 всем студентам

//    public static List<Student> modifyAge(List<Student> students) {
//        List<Student> filteredStudents = new ArrayList<>();
//        for (Student student : students) {
//            Student studentUpdatedAge = new Student(student.getName(), student.getAge() + 2);
//            filteredStudents.add(studentUpdatedAge);
//        }
//
//        return filteredStudents;
//    }

    public static void modifyAge(List<Student> students) {
        for (Student student : students) {
            student.setAge(student.getAge() + 2);
        }
    }
}
