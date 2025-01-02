package com.telran.prof.lessons.lessonsone;

public class Person {

    private String name;

    private String surname;

    private int age ;

    private  boolean vacatiom;

    public Person(String name, int age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isVacatiom() {
        return vacatiom;
    }

    public void setVacatiom(boolean vacatiom) {
        this.vacatiom = vacatiom;
    }
}
