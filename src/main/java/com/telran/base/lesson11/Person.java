package com.telran.base.lesson11;

/**
 * В Java есть класс под названием Object, это суперкласс,
 * это родитель всех классов в Java
 *
 */

public class Person {

    String name;

    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Our person {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
