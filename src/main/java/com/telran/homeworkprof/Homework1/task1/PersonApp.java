package com.telran.homeworkprof.Homework1.task1;

public class PersonApp {

    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person("Vasilii" , 33);

        firstPerson.move();
        firstPerson.talk();
        System.out.println(" ");
        secondPerson.move();
        secondPerson.talk();
    }
}
