package com.telran.base.lesson4;

import java.util.Random;

/**
 * Когда в переменную записали примитивное значение,
 * используем фразу - обращаемся к этой переменной
 * <p>
 * Когда в переменную записали ссылочное значение(созданное через new),
 * тогда переменная хранит не значение, а ссылку на объект
 * используем фразу - обращаемся к этому объекту, вызываем у этого объекта
 */
public class RandomExample {

    public static void main(String[] args) {
        //Random - это класс для генерации случайного числа
        Random random = new Random();
        //Случайное целое число в диапазоне инта
        int numberOne = random.nextInt();
        System.out.println("Random int = " + numberOne);

        //Случайное целое число в диапазоне from 0 to 99
        int numberTwo = random.nextInt(100);
        System.out.println("Random int = " + numberTwo);

        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));

        Math.random();
    }
}
