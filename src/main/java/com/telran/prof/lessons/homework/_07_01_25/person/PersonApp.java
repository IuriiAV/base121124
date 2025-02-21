package com.telran.prof.lessons.homework._07_01_25.person;

public class PersonApp {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Имя: " + person.fullName + "; Возраст: " + person.age);
        person.move();
        person.talk();

        System.out.println();

        Person person1 = new Person("Suleiman Musaev", 26);
        System.out.println("Имя: " + person1.fullName + "; Возраст: " + person1.age);
        person1.move();
        person1.talk();

    }

}
