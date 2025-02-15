package com.telran.prof.lessons.lesson8.hw.taskthree;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getAge() == p2.getAge()) {
            return p1.getName().compareTo(p2.getName());
        }
        return p1.getAge() - p2.getAge();
    }
}
