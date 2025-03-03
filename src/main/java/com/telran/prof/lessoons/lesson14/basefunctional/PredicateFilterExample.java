package com.telran.prof.lessoons.lesson14.basefunctional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFilterExample {

    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 150, 100, true);

        Predicate<Fruit> inStock = fruit -> fruit.isInStock();
        Predicate<Fruit> price = fruit -> fruit.getPrice() < 250;
        Predicate<Fruit> weight = fruit -> fruit.getWeight() > 50;

        System.out.println("Apple is in stock? " + inStock.test(apple));

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

        List<Fruit> byPrice = commonFillter(fruits, fruit -> fruit.getPrice() > 200);
        List<Fruit> byWeight = commonFillter(fruits, fruit -> fruit.getWeight() < 100);
        System.out.println(byWeight);
    }

    private static List<Fruit> commonFillter(List<Fruit> fruits, Predicate<Fruit> filter) {
        List<Fruit> filteredList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if(filter.negate().test(fruit)) {  //negate() - отрицание условия,
                //в этом случае добавляет противоположное
                filteredList.add(fruit);
            }
        }
        return filteredList;
    }

    private static List<Fruit> filteredByPrice(List<Fruit> fruits, int price) {
        List<Fruit> filteredList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if(fruit.getPrice() < price) {
                filteredList.add(fruit);
            }
        }
        return filteredList;
    }

    private static List<Fruit> filteredByWeight(List<Fruit> fruits, int weight) {
        List<Fruit> filteredList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if(fruit.getWeight() < weight) {
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
        for (Fruit fruit : fruits) {
            if (initFilter.test(fruit)) {
                filteredList.add(fruit);
            }
        }
        return filteredList;
    }
}
