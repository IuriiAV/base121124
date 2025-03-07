package com.telran.prof.lessonfourteen.basefunctional;

import java.util.function.Predicate;

/**
 * Predicate : Метод которого принимает любой параметр и возвращает true или false
 * method : boolean test(param)
 */
public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> comparator = (a) -> a > 10;
        System.out.println("15 > 10 " + comparator.test(15));
        System.out.println("5 > 10 " + comparator.test(5));

    }
}
