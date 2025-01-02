package com.telran.base.lesson11;

public class Dog {

    String name;

    int age;

    int height;

    String breed;

    public Dog(String name, int age, int height, String breed) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.breed = breed;
    }

    public void print() {
        System.out.println("Dog : " + name + " " + age + " " + height + " " + breed);
    }
}
