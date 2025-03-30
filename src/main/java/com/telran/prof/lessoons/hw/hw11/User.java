package com.telran.prof.lessoons.hw.hw11;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class User {

    private final String name;

    private final int age;

    public User(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age");

        }
        this.name = name;
        this.age = age;
    }
}
