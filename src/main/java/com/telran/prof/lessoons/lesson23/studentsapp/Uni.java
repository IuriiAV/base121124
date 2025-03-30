package com.telran.prof.lessoons.lesson23.studentsapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Uni {

    private List<Student> students = new ArrayList<>();

    public void init() {
        students.add(new Student("Max", "Smith", 24));
        students.add(new Student("George", "Slano", 20));
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(String name) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getName().equals(name)){
                iterator.remove();
                break;
            }
        }
    }

    public List<Student> getAll() {
        return students;
    }

}
