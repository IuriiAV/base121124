package com.telran.prof.lessons.lesson7;

import java.util.LinkedList;
import java.util.List;

/**
 * Структура данных - связный список(Linked list)
 * head : 5 -> 4 -> 7 -> 9 -> 3 -> null
 * Однонаправленный связный список
 *
 * двунаправленный связный список в джаве как класс
 * head : 5 <-> 4 <-> 7 -> 9 <-> 3 <-> null
 */
public class LinkedListExample {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(4);
        list.add(7);

        System.out.println(list);

        //Time complexity 0(n) - линейное время (линейное только для структуры данных - связный список,
        //для конкретного класса LinkedList в джава - это время постоянное, потому что в этом классе есть переменная,
        // которая всегда хранит ссылку на последний элемент)
        //add(value)
        //5 -> 4 -> 7 -> null

        //Time complexity 0(1) - постоянное время
        //add(index, value)

        //Time complexity 0(n) - линейное время
        //get(index)

        //Time complexity 0(n) - линейное время
        //remove(index)
    }
}
