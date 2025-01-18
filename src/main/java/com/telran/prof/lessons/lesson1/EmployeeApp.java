package com.telran.prof.lessons.lesson1;

public class EmployeeApp {

    public static void main(String[] args) {
        Employee alex = new Employee();
        alex.printInfo();
        alex.setAge(35);
        alex.printInfo();

        String name = alex.getName();
        System.out.println("Name is = " + name);

        alex.setAge(75);
        alex.printInfo();

//        alex.increaseSalary();
//        alex.increaseSalary();
//        alex.increaseSalary();
        alex.printInfo();

        Employee oleg = new Employee("Oleg", 5000);
        oleg.printInfo();
        oleg.setAge(29);
        oleg.printInfo();
        oleg.setAge(30);
        oleg.printInfo();
    }
}
