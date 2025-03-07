package com.telran.prof.lessons.lesson2;

public class DogApp {

    public static void main(String[] args) {
        Dog bigDog = new Dog();
        bigDog.voice();

        SmallDog smallDog = new SmallDog();
        smallDog.voice();
        smallDog.jump();
    }
}
