package com.telran.prof.lessons.lesson2.uni;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Student with name " + name);
    }
}
