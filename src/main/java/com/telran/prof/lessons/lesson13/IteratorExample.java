package com.telran.prof.lessons.lesson13;

import java.util.*;

/**
 * Есть интерфейс Iterable, который содержит iterator()
 * данный метод возвращает объект, который имплементирует интерфейс Iterable
 * А уже интерфейс Iterator имеет метод hashNext(), next, remove
 * Внутри каждого есть внутренний клас (Itr), который
 * имплементирует интерфейс Iterator и реализует метод next и hashNext
 * с учетом условий особенностей каждой коллекции
 * И именно объект этого класса Itr, мы получаем когда
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
        //hasNext() - проверяет есть ли следующий элемент
        //next() - берет следующий элемент и двигает курсор
        // -> 0 1 2 3 4 5 6 7 8 9
        boolean hasNext = iterator.hasNext();
        System.out.println(hasNext);

        Integer next = iterator.next(); //взяли значение перед курсором и передвинули курсор
        // 0 -> 1 2 3 4 5 6 7 8 9
        System.out.println("Next = " + next);
        next = iterator.next();
        // 0 1 -> 2 3 4 5 6 7 8 9
        System.out.println("Next = " + next);

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        //Integer next1 = iterator.next();

        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next() + " ");
        }

        Set<Integer> integerSet = new HashSet<>(list);
        System.out.println(integerSet);
        Iterator<Integer> iteratorSet = integerSet.iterator();
        while (iteratorSet.hasNext()){
            System.out.print(iteratorSet.next() + " ");
        }

        //list.iterator().forEachRemaining(System.out::println);
    }
}
