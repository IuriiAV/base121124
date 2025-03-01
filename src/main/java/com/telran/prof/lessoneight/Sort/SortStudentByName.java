package com.telran.prof.lessoneight.Sort;

import java.util.Comparator;

public class SortStudentByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        String nameOne = o1.getName();
        String nameTwo = o2.getName();
        return nameOne.compareTo(nameTwo);
    }
}
