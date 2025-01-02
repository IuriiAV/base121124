package com.telran.prof.lessoons.lesson1;

public class Employee {

    private String name;

    private int age;

    private String designation;

    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 18 || age > 70) {
            return;
        }
        this.age = age;
        checkBonus();
    }

    public String getName() {
        return name;
    }


    private void checkBonus() {
        if (age % 5 == 0) {
            increaseSalary();
        }
    }

    private void increaseSalary() {
        salary += 1000;
    }

    public void printInfo() {
        System.out.println("Employee name is " + name + " age " + age + " salary " + salary);
    }
}
