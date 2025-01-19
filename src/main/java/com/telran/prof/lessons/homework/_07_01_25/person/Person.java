package com.telran.prof.lessons.homework._07_01_25.person;

public class Person {

    String fullName;
    int age;

    public Person() {
        this.fullName = "";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public void move(){
        System.out.println("Такой-то " + fullName + " идет");
    }

    public void talk() {
        System.out.println("Такой-то " + fullName + " говорит");
    }


}
