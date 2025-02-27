package com.telran.prof.lessonseven;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *  Структура данных - связанный сипсок(Linked list) - это структура
 *  из отдельных элементов , которые связанные между собой через ссылку
 *  Это набор элементов , где каждый элемент имеет ссылку на другой элемент
 *
 */
public class LinkedListExample {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(4);
        list.add(11);

        System.out.println(list);
        // add (value)
        // add(index , value)
        // get(index)
        // remove (index)
    }
}
