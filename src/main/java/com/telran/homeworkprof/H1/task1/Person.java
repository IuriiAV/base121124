package com.telran.homeworkprof.H1.task1;

/**
 * 1.Класс Person
 * Создать класс Person, который содержит:
 *
 *
 * переменные fullName, age; +
 * методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то <имя> говорит"
 * и -"Такой-то <имя> идет"
 * Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age)
 *
 *
 * Вызовите у объектов методы move и talk
 *
 *
 */
public class Person {

    private String fullName;

    private int age;


    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println("Person with name : " + fullName + " going ");
    }

    public void talk(){
        System.out.println("Person with name : " + fullName + " talking ");
    }
}
