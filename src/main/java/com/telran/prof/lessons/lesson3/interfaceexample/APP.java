package com.telran.prof.lessons.lesson3.interfaceexample;

public class APP {

    public static void main(String[] args) {
        Bee bee = new Bee();
        Plane plane = new Plane();
        Flyable[] flyables = {bee, plane};
        for (Flyable flyable : flyables) {
            flyable.fly();
        }
        Buzzble[] buzzbles = {bee, plane};
        for (Buzzble buzzble : buzzbles) {
            buzzble.buzz();
        }
    }
}
