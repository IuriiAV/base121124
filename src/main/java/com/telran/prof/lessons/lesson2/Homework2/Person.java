package com.telran.prof.lessons.lesson2.Homework2;

public class Person {

    private String fullName;

    private int age;

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println("Такой-то " + fullName+" говорит");
    }

    public void talk(){
        System.out.println("Такой-то " + fullName + " идет");
    }


}
