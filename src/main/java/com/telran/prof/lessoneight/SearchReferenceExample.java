package com.telran.prof.lessoneight;

import java.util.ArrayList;
import java.util.List;

public class SearchReferenceExample {
    public static void main(String[] args) {


        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Yard" , "Black" , 5));
        cats.add(new Cat("Yard" , "Red" , 5));
        cats.add(new Cat("Yard" , "Black" , 15));
        cats.add(new Cat("British" , "Black" , 5));
        cats.add(new Cat("Yard" , "Black" , 5));

        Cat searchCat = new Cat("British", "Black", 5);

        System.out.println(cats.contains(searchCat));
    }
}

