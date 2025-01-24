package com.telran.prof.lessoons.lesson6;

import java.util.ArrayList;

/**
 * ArrayList - dynamic array - динамический массив, его размер
 * увеличивается тогда когда нам это нужно(автоматически при заполнении)
 * Очень удобная замена массиву
 *
 * Синонимы: Список, Список значений - это все о динамическом массиве
 *
 * Внутри этого объекта создается массив из 10 элементов
 * каждый раз, перед тем как добавить элемент через метод add,
 * проверяется есть ли у нас свободное место внутри этого внутреннего массива
 * Если свободного места нет, если внутренний массив оказался заполненный,
 * то у нас, внутри создается новый массив в 1,5 раза больше чем текущий,
 * все элементы старого массива копируются в новый, и в переменную
 * elementData записывается ссылка на новый массив, а старый будет удален сборщиком мусора
 *
 * Пример:
 * При создании массива из 10 элементов
 * Когда он заполняется, создается новый на 15 элементов
 * Когда заполняется и этот, создается новый на 22 элемента и тд
 *
 * У набора коллекция есть общий интерфейс
 * List - ArrayList, LinkedList
 * Set - TreeSet, HashSet
 * Queue - ArrayDeque, PriorityQueue
 * Map - TreeMap, HashMap
 */

public class ArrayListExample {

    public static void main(String[] args) {
        //ArrayList list = new ArrayList();
        //String[] strings = new String[10];
        ArrayList<String> list = new ArrayList<>(); // - называется коллекция список / Object[] elementData = new Object[10];
        //strings[0] = "one";
        //add - add element to list
        //add(index, value) - add element by index
        //list.add(0,"one");
        //add(value) - add element to end of the list
        list.add("one"); //0
        list.add("two"); //1
        list.add("three"); //2

        //System out println(Arrays.toString(strings))
        System.out.println(list);

        //get(index) - get element from list by index
        String one = list.get(0);
        System.out.println("Element by index 0 is " + one);

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println(list);
        System.out.println("Element by index 14 is " + list.get(14));

        //Time complexity 0(1) - постоянное время
        //метод add работает за константное время

        //Time complexity 0(1) - постоянное время
        //метод get(index) работает за константное время

        //Time complexity 0(n) - линейное время
        //add(index, value) - add by index
        //все значения сдвигаются вправо и переписываются в другую ячейку
        System.out.println(list);
        list.add(0,"Hello");
        System.out.println(list);

        //Time complexity 0(1) - постоянное(константное) время
        //set(index, value)

        list.set(2,"bye");
        System.out.println(list);

        //Time complexity 0(n) - линейное время
        //remove(index), remove(value)

        list.remove(2);
        list.remove("one");
        System.out.println(list);
        //элементы перезаписываются и смещаются на место удаленного
    }
}
