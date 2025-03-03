package com.telran.prof.lessoons.lesson14.basefunctional;

import java.util.function.Predicate;

/**
 * Predicate: Метод этого интерфейса принимает параметр любого типа и возвращает
 * true или false
 * Тип принимаемого и возвращаемого значения может быть одинаковый или разный
 * method: boolean test(E e)
 */

public class PridicateExample {

    public static void main(String[] args) {
        Predicate<Integer> comparator = (a) -> a > 10;
        System.out.println("15 > 10 " + comparator.test(15));
        System.out.println("5 > 10 " + comparator.test(5));
    }
}
