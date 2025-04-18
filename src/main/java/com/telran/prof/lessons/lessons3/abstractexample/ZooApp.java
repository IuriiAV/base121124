package com.telran.prof.lessons.lessons3.abstractexample;

import java.util.logging.Logger;

public class ZooApp {

    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin();
        Fish fish = new Fish();
        Horse horse = new Horse();
        Lion lion = new Lion();

        Animal[] animals = {dolphin, fish, lion, horse};
        for (Animal animal : animals){
            animal.eat();
            animal.sleep();
        }

        WaterAnimal[] waterAnimals = {dolphin, fish};
            for (WaterAnimal waterAnimal : waterAnimals){
                waterAnimal.swim();
                waterAnimal.eat();
                waterAnimal.sleep();
            }

        EarthAnimal[] earthAnimals = {lion, horse};
        for (EarthAnimal earthAnimal : earthAnimals){
            earthAnimal.walk();
            earthAnimal.eat();
            earthAnimal.sleep();
        }
    }
}
