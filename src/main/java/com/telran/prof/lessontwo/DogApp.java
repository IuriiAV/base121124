package com.telran.prof.lessontwo;

/**
 * Наследование - это принцип создания нового класса, на основе уже
 * существующего, с полностью или частично заимствованной функциональностью
 */
public class DogApp {

    public static void main(String[] args) {
        Dog bigDog = new Dog();
        bigDog.voice();

        SmallDog smallDog = new SmallDog();
        smallDog.voice(); // from Dog
        smallDog.jump(); // from SmallDog

    }
}
