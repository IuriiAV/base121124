package com.telran.prof.hw.hw1;

public class Person {

    private String fullName;

    private int age;

    public Person() {
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void talk() {
        System.out.println(fullName + " talk");
    }

    public void move() {
        System.out.println(fullName + " going");
    }
}
