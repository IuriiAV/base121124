package com.telran.prof.lessoons.lesson4;

public class AnimalApp {

    public static void main(String[] args) {
        Horse horse = new Horse();
        Pony pony = new Pony();
        LittlePony littlePony = new LittlePony();

        //Полиморфизм это работа с множеством различных объектов
        //через их общие интерфейсы без знания о конкретном объекте

        Horse[] horses = {horse, pony, littlePony};
        for (Horse horse1 : horses) {
            horse1.jump();
        }

    }
}
