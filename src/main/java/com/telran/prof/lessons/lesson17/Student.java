package com.telran.prof.lessons.lesson17;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    private int id;

    private String name;

    private Set<Book> books;
}
