package com.telran.prof.lessoons.lesson2;

public class DogApp {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.voice();

        SmallDog smallDog = new SmallDog();
        smallDog.voice();
        smallDog.jump();

    }
}
