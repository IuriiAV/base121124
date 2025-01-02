package com.telran.base.lesson11;

public class DogApp {

    public static void main(String[] args) {
        Dog dogOne = new Dog("Sharik", 10, 120, "Sharka");
        Dog dogTwo = new Dog("Bobik", 5, 110, "Bob");
        Dog dogThree = new Dog("Pupsik", 11, 112, "Pups");

        System.out.println(dogOne);

        dogOne.print();
        dogTwo.print();

        Dog[] arrayDog = {dogOne, dogTwo, dogThree};

        //foreach
        //for(<type> <name variable> : <array>)
        //Перебирает все элементы массива и в каждой итерации цикла ,
        //помещает текущий элемент массива в переменную, заданную в сигнатуре цикла
        //в примере ниже это переменная dog
        for (Dog dog : arrayDog) {
            dog.print();
        }
    }
}
