package com.telran.prof.lessons.lesson4;

public class AnimalApp {

    public static void main(String[] args) {
        Horse smallHorse = new Horse();
        Pony pony = new Pony();
        LittlePony littlePony = new LittlePony();

        Horse[] horses = {smallHorse, pony, littlePony};
        for(Horse horse : horses){
            horse.jump();
        }
    }
}
