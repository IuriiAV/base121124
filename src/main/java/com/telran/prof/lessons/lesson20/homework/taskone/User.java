package com.telran.prof.lessons.lesson20.homework.taskone;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

    private String name;

    private int age;

    public User(String name, int age) {
        if (age < 18){
            throw new InvalidAgeException("Age " + name + ": " + age + " is under 18");
        }
        this.name = name;
        this.age = age;
    }


}
