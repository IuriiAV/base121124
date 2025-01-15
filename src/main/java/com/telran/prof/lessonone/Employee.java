package com.telran.prof.lessonone;

/**
 * private - доступ к полям и методам только внутри класса
 * <p>
 * default(отсутствие какого либо модификатора) - доступ к полям и методам
 * внутри класса и внутри пакета
 * <p>
 * protected - - доступ к полям и методам
 * внутри класса и внутри пакета и в классах наследниках
 * <p>
 * public - доступ ото всюду
 * <p>
 * Инкапсуляция - сокрытие данных и логики для работы с ними, внутри класса
 * и предоставление некого внешнего апи для работы с этими данными
 * <p>
 *
 * Более просто инкапсуляция это - Сокрытие данных
 * Сокрытие данных - все переменные должны быть private, а доступ к ним
 * через паблик геттеры и сеттеры
 *
 * getters and setters - это методы, которые начинаются с глагола get
 * для получения данных и с глагола set для установки данных
 */
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

    public void setAge(int age) {
        if (age < 18 || age > 70) {
            return;
        }
        this.age = age;
        giveBonus(age);
    }

    public String getName() {
        return name;
    }

    private void giveBonus(int age) {
        if (age % 5 == 0) {
            increaseSalary();
        }
    }

    private void increaseSalary() {
        salary += 1000.0;
    }

    public void printInfo() {
        System.out.println("Employee name " + name + " age = " + age + " salary " + salary);
    }
}
