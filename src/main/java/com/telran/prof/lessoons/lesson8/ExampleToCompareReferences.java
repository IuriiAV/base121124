package com.telran.prof.lessoons.lesson8;

/**
 * Для всех ссылочных типов данных сравнение через == сравнивает ссылки на объекты
 *
 * Для сравнения ссылочных типов данных, мы используем метод equals
 */

public class ExampleToCompareReferences {

    public static void main(String[] args) {
        Cat catOne = new Cat("Yard", "black", 10);
        Cat catTwo = new Cat("Yard", "black", 10);

        if (catOne == catTwo) { //#FFAA00 == #HHAA01
            System.out.println("Our cat is equals");
        } else {
            System.out.println("Our cat is not equals");
        }

        if (catOne.equals(catTwo)) {
            System.out.println("Our cat is equals");
        } else {
            System.out.println("Our cat is not equals");
        }
    }
}
