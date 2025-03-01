package com.telran.prof.lessonsix;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {
    //HEAP : List #FFHH00  (#FFAA10, #HHEEFF)
    //        : Student("Alex", 24) #FFAA10
    //        : Student("Max", 55) #HHEEFF

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 24));
        students.add(new Student("Max", 55));
        students.add(new Student("Oleg", 21));
        students.add(new Student("Petr", 18));

        //Написать метод, который вернет список студентов с возрастом больше 22
        //Написать метод, который увеличит возраст на 2 всем студентам в списке
    }

    public static List<Student> modifyAge(List<Student> students) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            Student studentUpdatedAge = new Student(student.getName(), student.getAge() + 2);
            filteredStudents.add(studentUpdatedAge);
        }

        return filteredStudents;
    }

    public static void addAge(List<Student> students) {
        for (Student student : students) {
            student.setAge(student.getAge() +2);
        }
    }
}
