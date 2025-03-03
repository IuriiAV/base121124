package com.telran.prof.lessoons.lesson14.basefunctional;

import java.util.function.BiConsumer;

/**
 * Consumer: Метод которого принимает два любых параметра и ничего не возвращает
 * method: void accept(param)
 */


public class BiConsumerExample {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> sum = (a, b) -> System.out.println("Sum = " + a + b);
        sum.accept(98,56);
    }
}
