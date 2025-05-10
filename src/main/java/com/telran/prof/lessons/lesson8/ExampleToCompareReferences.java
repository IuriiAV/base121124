package com.telran.prof.lessons.lesson8;

/**
 * Для всех ссылочных типов данных, сравнение через == сравнивает ссылки на объекты
 * <p>
 * Для сравнения ссылочных типов данных, мы используем метод equals
 */
public class ExampleToCompareReferences {

    public static void main(String[] args) {
        Cat catOne = new Cat("Yard", "Yellow", 10); //#FFAA0
        Cat catTwo = new Cat("Yard", "Yellow", 9);  //#HHAA0
        catOne.setName("Mursik");
        catTwo.setName("Barsik");

        if (catOne == catTwo) { // #FFAA0 == #HHAA0
            System.out.println(" == Our cat is equals");
        } else {
            System.out.println(" == Our cat is not equals");
        }

        if (catOne.equals(catTwo)) {
            System.out.println(".equals Our cat is equals");
        } else {
            System.out.println(".equals Our cat is not equals");
        }
    }
}
