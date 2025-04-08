package com.telran.prof.lessons.lessonsone;

public class EmployerApp {

    public static void main(String[] args) {
        Employee alex = new Employee("Alex", 1000);
        alex.setAge(35);
        alex.printInfo();

        String name = alex.getName();
        System.out.println("Name is " + name);
        alex.setAge(75);
        alex.printInfo();

        Employee oleg = new Employee("Oleg", 5000);
        oleg.printInfo();
        oleg.setAge(39);
        oleg.printInfo();
        oleg.setAge(40);
        oleg.printInfo();
    }
}
