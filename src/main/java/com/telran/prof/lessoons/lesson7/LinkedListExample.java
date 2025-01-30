package com.telran.prof.lessoons.lesson7;

import java.util.LinkedList;
import java.util.List;

/**
 * Структура данных - связный список (Linked list) - это структура
 * состоит из отдельных элементов, которые связаны между собой через ссылку
 * Это набор элементов, где каждый элемент имеет ссылку на другой элемент
 * head : 5 -> 4 -> 7 -> 9 -> 3 -> null
 * Однонаправленный связный список
 * <p>
 * В джава существуют коллекция, которая представлена классом LinkedList :
 * Это тоже связный список, но там элементы связаны между собой в две стороны
 * Это так называемый двунаправленный связный список
 * head : 5 <-> 4 <-> 7 <-> 9 <-> 3 <-> null
 */
public class LinkedListExample {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(4);
        list.add(7);

        System.out.println(list);

        //Time complexity O(n) - линейное время (линейное только для структуры данных
        // связный список, для конкретного класса LinkedList в джава - это время постоянное
        // потому что в этом классе есть переменная которая всегда хранит ссылку на последний
        // элемент)
        //add(value)
        //5 -> 4 -> 7 -> null

        //Time complexity O(1) - постоянное время
        //add(index, value)

        //Time complexity O(n) - линейное время
        //get(index)

        //Time complexity O(1) - постоянное время
        //remove(index)

    }
}
