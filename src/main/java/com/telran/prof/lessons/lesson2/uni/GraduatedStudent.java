package com.telran.prof.lessons.lesson2.uni;

/**
 * В классе наследнике вызов super.<methodName> вызов метода из родительского класса
 * а вызов suer() - вызов конструктора родительского класса
 */
public class GraduatedStudent extends Student{

    public GraduatedStudent(String name) {
        super(name); //super() - вызов метода конструктора родительского класса
    }
}
