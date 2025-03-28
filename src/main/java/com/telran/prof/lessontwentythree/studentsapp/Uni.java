package com.telran.prof.lessontwentythree.studentsapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Uni {

    private List<Student> students = new ArrayList<>();

    public void init() {
        students.add(new Student("Alex", "Alexeev", 35));
        students.add(new Student("Max", "Maximov", 20));
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(String name) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            if (next.getName().equals(name)) {
                iterator.remove();
                break;
            }
        }
    }

    public List<Student> getAll() {
        return students;
    }
}
