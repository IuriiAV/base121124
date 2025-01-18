package com.telran.prof.lessons.lesson3.absractexample;

/**
 * Animal - eat, sleep
 * WaterAnimal - swim,eat,sleep
 * EarthAnimal - walk, eat, sleep
 *
 * Horse,Lion - walk, eat, sleep
 * Dolphin, Fish - swim,eat,sleep
 */
public class ZooApp {

    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin();
        Fish fish = new Fish();
        Horse horse = new Horse();
        Lion lion = new Lion();

        Animal[] animals = {dolphin,fish,horse,lion};
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }

        WaterAnimal[] waterAnimals = {dolphin,fish};
        for (WaterAnimal waterAnimal : waterAnimals) {
            waterAnimal.eat();
            waterAnimal.sleep();
            waterAnimal.swim();
        }

        EarthAnimal[] earthAnimals = {lion,horse};
        for (EarthAnimal earthAnimal :earthAnimals) {
            earthAnimal.eat();
            earthAnimal.sleep();
            earthAnimal.walk();
        }

    }
}
