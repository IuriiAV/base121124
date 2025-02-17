package com.telran.prof.lessons.lesson2.zoo;

public class ZooApp {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.setAge(10);
        horse.setName("Bublik");
        horse.printInfo();
        horse.run();

        System.out.println();

        Pony pony = new Pony();
        pony.setAge(5);
        pony.setName("Little pony");
        pony.run();
        pony.walk();
        pony.printInfo();
    }
}
