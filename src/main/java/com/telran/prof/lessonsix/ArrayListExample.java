package com.telran.prof.lessonsix;

import java.util.ArrayList;

/**
 * ArrayList - dynamic array - это динамический массив, его размер
 * увеличивается тогда когда нам это нужно(автоматически при заполнении)
 * Очень удобная замена массиву
 *
 * Синонимы: Список, Список значений - это все о динамическом массиве
 *
 * Внутри этого объекта создается массив и 10 элементов
 * Каждый раз, перед тем как добавить элемент через метод add,
 * проверяется есть ли у нас свободное место внутри этого внутреннего массива
 * Если свободного места нет, те если внутренний массив оказался заполненный,
 * то у нас , внутри создается новый массив в 1,5 раза больше чем текущий,
 * все элементы старого массива копируются в новый, и в переменную
 * elementData записывается ссылка на новый массив, а старый массив будет удален сборщиком мусора
 * Пример :
 * При создании массив из 10 элементов
 * Когда он заполняется , создается новый на 15 элементов,
 * Когда заполняется и этот, то создается новый на 22 элемента и тд
 *
 * У набора коллекций - есть общий интерфейс
 * List - ArrayList, LinkedList
 * Set - TreeSet, HashSet
 * Queue - ArrayDeque, PriorityQueue
 * Map - TreeMap, HashMap
 */
public class ArrayListExample {

    public static void main(String[] args) {
        //String[] strings = new String[10];
        ArrayList<String> list = new ArrayList<>(); // Object[] elementData = new Object[10];
        //strings[0] = "one";
        //add - add element to list
        //add(index, value) - add element by index
        //list.add(0,"one");
        //strings[0] = , strings[1] = , strings[2]=  etc
        //add(value) - add element to end of the list
        list.add("one");  // 0
        list.add("two");  // 1
        list.add("three");// 2

        //System.out.println(Arrays.toString(strings))
        System.out.println(list);

        //String str = strings[0];
        //get(index) - get element from list by index
        String one = list.get(0);
        System.out.println("Element by index 0 is " + one);

        list.add("one");  // 3
        list.add("two");  // 4
        list.add("three");// 5
        list.add("one");  // 6
        list.add("two");  // 7
        list.add("three");// 8
        list.add("one");  // 9
        list.add("two");  // 10
        list.add("three");// 11
        list.add("one");  // 12
        list.add("two");  // 13
        list.add("three");// 14

        System.out.println(list);
        System.out.println("Element by index 12 is " + list.get(12));

        //Time complexity O(1) - постоянное время
        //add(value) - add value to the end of array
        //["one","two","three", null, null, null, null]
        //add("six") - add by free index
        //["one","two","three", "six", null, null, null]

        //Time complexity O(1) - постоянное время
        //get(index) - get by index

        //Time complexity O(n) - линейное время
        //add(index, value) - add by index
        //["one","two","three", "six", null, null, null]
        //add(0,"Hello");
        //["Hello", "one","two","three", "six", null, null]
        System.out.println(list);
        list.add(0,"Hello");
        System.out.println(list);

        //Time complexity O(1) - постоянное время
        //set(index, value) - set element by index
        list.set(2,"Bye");
        System.out.println(list);

        //Time complexity O(n) - линейное время
        //remove(index) , remove(value)
        //["Hello", "one","two","three", "six", null, null]
        //remove(2)
        //["Hello", "one","three", "six", null, null, null]
        list.remove(1);
        System.out.println(list);
        list.remove("one");
        System.out.println(list);
    }
}
