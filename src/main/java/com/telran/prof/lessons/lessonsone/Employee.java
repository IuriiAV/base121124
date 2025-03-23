package com.telran.prof.lessons.lessonsone;

/**
 * private - доступ к полям и методам только изнутри класса
 *
 * default(отсутсвие модификатора) - доступ внутри класа
 * и внутри пакета
 *
 * protected - доступ внутри класа
 *  * и внутри пакета и в класса наследниках
 *
 *  public - доступ ото всюду
 *
 *  Инкапсуляция - сокритие данных и логики для роботы с ними ,
 */
public class Employee {

    private String name;

    private int age;

    private String designation;

    private double salary;

    public Employee(String name , double salary) {
        this.name = name;
        this.salary = salary;
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
    private void checkBonus(){
        if (age % 5 == 0){
            increaseSalary();
        }
    }
    private void increaseSalary() {
        salary += 1000;
    }

    public void printInfo() {
        System.out.println("Employee name " + name + " age " + age + " salary " + salary);
    }
}

