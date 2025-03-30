package com.telran.prof.lessons.lesson14.functionalexample;

import java.util.Comparator;

public class SortByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
