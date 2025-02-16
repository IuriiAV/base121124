package com.telran.prof.lessoneight;

/**
 *
 * Для всех ссылочных типов данных, сравнение через == сравнивает ссылки на объекты
 *
 * Для сравнения ссылочных типов данных, мы используем метод equals
 */
public class ExampleToCompareReferences {

    public static void main(String[] args) {
        Cat catOne = new Cat("Yard","Yellow",10); //#FFAA00
        Cat catTwo = new Cat("Yard","Yellow",10); //#HHAA01
        catOne.setName("Barsik");
        catTwo.setName("Mursik");

        if (catOne == catTwo) { // #FFAA00 == #HHAA01
            System.out.println(" == Our cat is equals");
        } else {
            System.out.println(" == Our cat is not equals");
        }

        if (catOne.equals(catTwo)) { //
            System.out.println("equals : Our cat is equals");
        } else {
            System.out.println("equals : Our cat is not equals");
        }

    }
}
