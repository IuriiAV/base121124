package com.telran.prof.lessons.lesson1;

public class Employee {

    private String name;

    private int age;

    private String designation;

    private double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setAge(int age){
        if (age < 18 || age > 70){
            return;
        }
        this.age = age;
        giveBonus(age);
    }

    public String getName(){
        return this.name;
    }

    private void giveBonus(int age){
        if (age % 5 == 0){
            increaseSalary();
        }
    }

    private void increaseSalary(){
        salary += 1000.0;
    }

    public void printInfo(){
        System.out.println("Employee name " + name + " age = " + age + " salary " + salary);
    }
}
