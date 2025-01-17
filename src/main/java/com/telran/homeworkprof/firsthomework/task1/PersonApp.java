package com.telran.homeworkprof.firsthomework.task1;

public class PersonApp {

    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person("Vasilii" , 33);

        firstPerson.move();
        firstPerson.talk();
        secondPerson.move();
        secondPerson.talk();
    }
}
