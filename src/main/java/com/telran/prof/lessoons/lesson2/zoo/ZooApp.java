package com.telran.prof.lessoons.lesson2.zoo;

public class ZooApp {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.setAge(43);
        horse.setName("Busya");
        horse.printInfo();
        horse.run();

        Pony pony = new Pony();
        pony.setName("Little pony");
        pony.setAge(4);
        pony.run();
        pony.step();
        pony.printInfo();
    }
}
