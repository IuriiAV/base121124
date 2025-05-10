package com.telran.prof.hw.hw1;

public class PersonApp {

    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.setFullName("Alex Orlov");
        Person personTwo = new Person("Oleg Smirnov", 30);

        Person[] persons = {personOne, personTwo};

        for (Person person : persons) {
            person.move();
            person.talk();
        }
    }
}
