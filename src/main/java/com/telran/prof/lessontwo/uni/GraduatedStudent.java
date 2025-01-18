package com.telran.prof.lessontwo.uni;

/**
 * В классе наследнике вызов super.<methodname> вызов метода из родительского класса,
 * а вызов super() - вызов конструктора родительского класса
 */
public class GraduatedStudent extends Student {

    public GraduatedStudent(String name) {
        super(name); // super() - вызов конструктора родительского класса
    }
}
