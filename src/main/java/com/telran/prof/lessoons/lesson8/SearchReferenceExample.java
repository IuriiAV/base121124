package com.telran.prof.lessoons.lesson8;

import java.util.ArrayList;
import java.util.List;

public class SearchReferenceExample {

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Yard", "Black", 10));
        cats.add(new Cat("Yard", "White", 15));
        cats.add(new Cat("Yard", "Red", 5));
        cats.add( new Cat("British", "White", 5));
        cats.add(new Cat("Yard", "Grey", 5));


        Cat searchCat = new Cat("British", "White", 5);

        System.out.println(cats.contains(searchCat));

        //Принято во всех объектах реализовать метод toString, equals, hashcode
    }
}
