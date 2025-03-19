package com.telran.prof.lessonfourteen.basefunctional;

import java.util.*;
import java.util.function.Predicate;

public class FilterApp {

    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
                new Fruit("Apple", 150, 100, true),
                new Fruit("Lemon", 100, 50, false),
                new Fruit("Banana", 200, 200, true),
                new Fruit("Pineapple", 500, 300, true));

        Predicate<Fruit> inStock = fruit -> fruit.isInStock();
        Predicate<Fruit> price = fruit -> fruit.getPrice() < 250;
        Predicate<Fruit> weight = fruit -> fruit.getWeight() > 50;

        Map<String, Predicate<Fruit>> allFilters = new HashMap<>();
        allFilters.put("price < 250 ", price);
        allFilters.put("in stock ", inStock);
        allFilters.put("weight > 50 ", weight);

        List<Predicate<Fruit>> filters = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        allFilters.forEach((title, filter) -> {
            System.out.println("Do you want filter by " + title + "? ");
            boolean data = scanner.nextBoolean();
            if (data) {
                filters.add(filter);
            }
        });

//
//        System.out.println("Do you want filter by price < 250 ? ");
//        boolean data = scanner.nextBoolean();
//        if (data) {
//            filters.add(price);
//        }
//        System.out.println("Do you want filter by inStock ?");
//        data = scanner.nextBoolean();
//        if (data) {
//            filters.add(inStock);
//        }
//        System.out.println("Do you want filter by weight ?");
//        data = scanner.nextBoolean();
//        if (data) {
//            filters.add(weight);
//        }

        List<Fruit> filteredList = filterFruits(fruits, filters);
        System.out.println(filteredList);
    }

    private static List<Fruit> filterFruits(List<Fruit> fruits,
                                            List<Predicate<Fruit>> filters) {
        if (filters.isEmpty()) {
            return fruits; // если список фильтров пустой, то возвращаем оригинальный лист
        }

        //Здесь делаем один большой фильтр из нескольких вида
        //price.and(weight).and(title).and(inStock)...etc
        Predicate<Fruit> initFilter = filters.get(0);
        for (int i = 1; i < filters.size(); i++) {
            initFilter = initFilter.and(filters.get(i));
        }

        //Проверяем каждый продукт на соответствие фильтру
        // и если ок, то добавляем в список
        List<Fruit> filteredList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (initFilter.test(fruit)) {
                filteredList.add(fruit);
            }
        }
        return filteredList;
    }
}
