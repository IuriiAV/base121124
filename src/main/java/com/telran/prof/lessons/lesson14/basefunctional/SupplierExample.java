package com.telran.prof.lessons.lesson14.basefunctional;

import com.github.javafaker.Address;
import com.github.javafaker.Color;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Double> randomizer = () -> Math.random();
        System.out.println(randomizer.get());
        System.out.println(randomizer.get());
        System.out.println(randomizer.get());
        System.out.println(randomizer.get());
        System.out.println(randomizer.get());


        Faker faker = new Faker();

        Color color = faker.color();
        System.out.println(color);

        Name name = faker.name();
        System.out.println(name.lastName() + name.firstName());

        Address address = faker.address();
        System.out.println(address.fullAddress());

        Supplier<Person> personGenerator = () -> {
            Faker data = new Faker();
            return new Person(data.funnyName().name(),
                    data.name().lastName(),
                    data.number().numberBetween(18, 55),
                    data.address().fullAddress());
        };

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            people.add(personGenerator.get());
        }
        System.out.println(people);

    }
}
