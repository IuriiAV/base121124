package com.telran.prof.lessons.lesson8;

import java.util.ArrayList;
import java.util.List;

public class SearchReferenceExample {

    public static void main(String[] args) {

        Cat catOne = new Cat("Yard", "Yellow", 10);
        Cat catTwo = new Cat("Yard", "Red", 10);

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Yard", "Red", 10));
        cats.add(new Cat("Yard", "Yellow", 5));
        cats.add(new Cat("British", "White", 15));
        cats.add(new Cat("Yard", "Gray", 3));
    }
}
