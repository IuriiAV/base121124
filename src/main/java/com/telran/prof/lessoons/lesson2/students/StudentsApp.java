package com.telran.prof.lessoons.lesson2.students;

public class StudentsApp {

    public static void main(String[] args) {

        Student alex = new Student("Alex");
        alex.print();

        GraduatedStudent oleg = new GraduatedStudent("Oleg");
        oleg.print();
    }
}
