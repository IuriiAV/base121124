package com.telran.prof.lessons.lesson2.Homework2;

public class PersonApp {

    public static void main(String[] args) {
        Person noname = new Person();
        Person alex = new Person("Alex", 25);

        noname.move();
        alex.talk();
    }
}
