package com.telran.prof.lessoons.lesson17;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Set;

@Getter
@AllArgsConstructor
@ToString
public class Student {

    private int id;

    private String name;

    private Set<Book> books;
}
