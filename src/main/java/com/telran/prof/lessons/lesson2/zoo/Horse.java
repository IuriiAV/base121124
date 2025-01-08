package com.telran.prof.lessons.lesson2.zoo;

public class Horse {

    private String name;

    private int age;

    public void run() {
        System.out.println("Horse with name " + name + " is running");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Horse with name " + name + " and age: " + age);
    }
}