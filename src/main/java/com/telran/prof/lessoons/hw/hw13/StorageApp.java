package com.telran.prof.lessoons.hw.hw13;

import java.util.ArrayList;

public class StorageApp {

    public static void main(String[] args) {
        //Storage<Food> - List<Food> -> add(Food), get(Food)
        //Storage<Drink> - List<Drink> -> add(Drink), get(Drink)

        Storage<Food> foodStorage = new Storage<>(new ArrayList<>());
        foodStorage.storage(new Food("banana"));
        foodStorage.storage(new Food("apple"));

        Storage<Drink> drinkStorage = new Storage<>(new ArrayList<>());
        drinkStorage.storage(new Drink("coke"));
        drinkStorage.storage(new Drink("juice"));

        System.out.println(foodStorage);
        Food food = foodStorage.get(1);
        System.out.println(food);

        Drink drink = drinkStorage.get(0);
        System.out.println(drink);
    }
}
