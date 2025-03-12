package com.telran.prof.lessons.lesson8;

public class ExampleToCompareReferences {

    public static void main(String[] args) {
        Cat catOne = new Cat("Yard","Yellow", 10);
        Cat catTwo = new Cat("Yard","Yellow", 10);
        catOne.setName("Barsik");
        catTwo.setName("Mursik");

        if (catOne == catTwo){
            System.out.println(" == Our cat is equals");
        } else {
            System.out.println(" == Our cat is not equals");
        }

        if (catOne.equals(catTwo)){
            System.out.println("equals : Our cat is equals");
        } else {
            System.out.println("equals : Our cat is not equals");
        }
    }
}
