package com.telran.prof.lessoons.lesson13;

import java.util.*;

/**
 * Есть интерфейс Iterable, который содержит метод iterator()
 * данный метод возвращает объект, который имплиментирует интерфейс Iterator
 * А уже интерфейс Iterator имеет методы hasNext, next, remove
 * Внутри каждой коллекции есть внутренний класс (Itr), который
 * инплиментирует интерфейс Iterator и реализует методы next, hasNext
 * с учетом условий особенностей каждой коллекции
 * И именно объект этого класса Itr, мы получаем когда вызываем метод
 * iterator() у коллекции
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
        //hasNext() - метод, который проверяет есть ли следующий элемент
        //next() - метод, который берет следующий элемент и двигает курсор
        //-> 0 1 2 3 4 5 6 7 8 9
        boolean hasNext = iterator.hasNext();
        System.out.println(hasNext);

        Integer next = iterator.next(); //взяли значение перед курсором и передвинули курсор
        //0 -> 1 2 3 4 5 6 7 8 9
        System.out.println("Next = " + next);
        next = iterator.next();
        //0 1 -> 2 3 4 5 6 7 8 9
        System.out.println("Next = " + next);

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()) {
            System.out.print(integerIterator.next() + " ");
        }
        System.out.println();

        Set<Integer> integerSet = new HashSet<>(list);
        System.out.println(integerSet);
        Iterator<Integer> iterator1 = integerSet.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }

        System.out.println();
        list.iterator().forEachRemaining((i) -> System.out.print(i + " "));
        list.forEach((element) -> {
            System.out.println(" " + element);
        });
    }
}
