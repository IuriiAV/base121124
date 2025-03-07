package com.telran.prof.lessons.lesson6;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 24));
        students.add(new Student("Max", 55));
        students.add(new Student("Oleg", 21));
        students.add(new Student("Petr", 18));


        System.out.println(getStudentByAge(students, 22));

        //написать метод который вернет список студентов с возростом больше 22
        List<Student> studentAge = getStudentMultiAge(students);
        System.out.println(studentAge);
    }

    public static List<Student> getStudentByAge(List<Student> students, int age){
        List<Student> filteredAge = new ArrayList<>();
        for (Student value : students){
            if (value.getAge() > age){
                filteredAge.add(value);
            }
        }
        return filteredAge;
    }

    public static List<Student> getStudentMultiAge(List<Student> students){
        for (Student value : students){
            value.setAge(value.getAge() + 2);
        }
        return students;
    }

    /**
     *
     *     public static List<Student> modifyAge(List<Student> students) {
     *         List<Student> filteredStudents = new ArrayList<>();
     *         for (Student student : students) {
     *             Student studentUpdatedAge = new Student(student.getName(), student.getAge() + 2);
     *             filteredStudents.add(studentUpdatedAge);
     *         }
     *
     *         return filteredStudents;
     *     }
     */

}
