package com.telran.prof.lessons.lesson13;

import java.util.*;

/**
 * Есть интерфейс Iterable, который содержит метод iterator(),
 * Данный метод возвращает объект, который имплементирует интерфейс Iterator
 * А уже интерфейс Iterator имеет методы hasNext, next, remove
 * Внутри каждой коллекции есть внутренний класс (Itr), который имплементирует интерфейс Iteartor
 * и реализует методы next и hasNext с учетом условий особенностей каждой коллекции
 * И именно объект этого класса Itr, мы получаем, когда вызываем метод Iterator() у коллекции
 *
 */
public class IteratorExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

        Iterator<Integer> iterator = list.iterator();
        //hasNext() - проверяет, есть ли следующий элемент
        //next() - метод, который берет следующий элемент и двигает курсор
        // -> 0 1 2 3 4 5 6 7 8 9
        boolean hasNext = iterator.hasNext();
        System.out.println(hasNext);

        Integer next = iterator.next();
        System.out.println("Next = " + next);
        // 0 -> 1 2 3 4 5 6 7 8 9
        next = iterator.next();
        System.out.println("Next = " + next);
        next = iterator.next();
        System.out.println("Next = " + next);

        System.out.println();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println();
        Set<Integer> integerSet = new HashSet<>(list);
        System.out.println(integerSet);

        Iterator<Integer> iterator1 = integerSet.iterator();
        while (iterator1.hasNext())
            System.out.print(iterator1.next() + " ");
    }
}
