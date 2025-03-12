package com.telran.prof.lessons.lesson14.basefunctional;

import com.telran.base.lesson5.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFilterExample {

    public static void main(String[] args) {

        Predicate<Fruit> inStock = fruit -> fruit.isInStock();
        Predicate<Fruit> price = fruit -> fruit.getPrice() < 250;
        Predicate<Fruit> weight = fruit -> fruit.getWeight() > 50;

        //System.out.println("Apple is in stock? " + inStock.test(apple));

        List<Fruit> fruits = Arrays.asList(
                new Fruit("Apple", 150, 100, true),
                new Fruit("Lemon", 100, 50, false),
                new Fruit("Banana", 200, 200, true),
                new Fruit("Pineapple", 500, 300, true));

        for (Fruit fruit : fruits) {
            boolean test = inStock.and(price).and(weight).test(fruit);
            if (test) {
                System.out.println(fruit);
            }
        }

        List<Predicate<Fruit>> filters = Arrays.asList(inStock, price, weight);

        List<Fruit> filteredList = filterFruits(fruits, filters);
        System.out.println(filteredList);

        System.out.println();

        List<Fruit> byPrice = commonFilter(fruits, (fruit -> fruit.getPrice() > 200));
        System.out.println(byPrice);
        List<Fruit> byWeight = commonFilter(fruits, fruit -> fruit.getWeight() < 100);
        System.out.println(byWeight);


    }

    private static List<Fruit> commonFilter(List<Fruit> fruits, Predicate<Fruit> filter){
        List<Fruit> filteredList = new ArrayList<>();
        for (Fruit fruit : fruits){
            if (filter.test(fruit)){
                filteredList.add(fruit);
            }
        }
        return filteredList;
    }

    private static List<Fruit> filterByPrice(List<Fruit> fruits, int price){
        List<Fruit> filteredList = new ArrayList<>();
        for (Fruit fruit : fruits){
            if (fruit.getPrice() < price){
                filteredList.add(fruit);
            }
        }
        return filteredList;
    }

    private static List<Fruit> filterByWeight(List<Fruit> fruits, int weight){
        List<Fruit> filteredList = new ArrayList<>();
        for (Fruit fruit : fruits){
            if (fruit.getPrice() < weight){
                filteredList.add(fruit);
            }
        }
        return filteredList;
    }

    private static List<Fruit> filterFruits(List<Fruit> fruits,
                                            List<Predicate<Fruit>> filters) {
        if (filters.isEmpty()) {
            return fruits;
        }
        Predicate<Fruit> initFilter = filters.get(0);
        for (int i = 1; i < filters.size(); i++) {
            initFilter = initFilter.and(filters.get(i));
        }
        List<Fruit> filteredList = new ArrayList<>();
        for (Fruit fruit : fruits){
            if (initFilter.test(fruit)){
                filteredList.add(fruit);
            }
        }
        return filteredList;
    }
}


