package com.telran.prof.lessontwentythree.studentsapp;

import lombok.Getter;

@Getter
public class Student {

    private String name;

    private String surname;

    private int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
