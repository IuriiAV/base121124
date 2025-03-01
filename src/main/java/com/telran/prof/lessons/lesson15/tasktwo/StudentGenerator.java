package com.telran.prof.lessons.lesson15.tasktwo;

@FunctionalInterface
public interface StudentGenerator {

    Student createStudent(int id, String name, String surname);
}
