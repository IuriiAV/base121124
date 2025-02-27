package com.telran.prof.lessoneight;

/**
 *
 * Для ссылочных типов данных б сравнение через == сравниваються ссылки на объкт
 *
 */
public class ExampleToCompareReferences {
    public static void main(String[] args) {
        Cat catOne = new Cat("Yard", "Yellou" , 10);
        Cat catTwo = new Cat("Yard", "Yellou" , 10);
        catOne.setName("Mursik");
        catTwo.setName("barb");


        if (catTwo.equals(catOne)){
            System.out.println("cats is same");
        }
        else {
            System.out.println("cats is not same");
        }

    }
}
