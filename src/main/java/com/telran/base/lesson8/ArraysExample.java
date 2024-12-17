package com.telran.base.lesson8;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Arrays - утильный(вспомогательный) класс, для работы с массивами
 * toString(array) - представление массива как строка
 * sort() - сортирует массив по возрастанию
 */
public class ArraysExample {

    public static void main(String[] args) {
        int[] ints = {4, 4, 4, 4, 4, 3, 2, 5, 1, 6, 456, 56, 4, 646, 3, 4, 5, 435};

        String array = Arrays.toString(ints);
        System.out.println(array);

        System.out.println(Arrays.toString(ints));

        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

        Integer[] intsOne = {4, 1, 3, 2, 3, 5, 6, 57, 74, 3, 45, 4};
        Arrays.sort(intsOne, Comparator.reverseOrder());
        System.out.println(Arrays.toString(intsOne));

        int primitive = 5;
        Integer primitiveInt = 5;
        primitive = primitiveInt;
        primitiveInt = primitive;

        //int  - Integer
        //boolean - Boolean
        //char - Character
        //byte - Byte
        //long - Long
        //double - Double
        //float - Float
    }
}
