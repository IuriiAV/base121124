package com.telran.prof.lessons.lesson14.basefunctional;

import java.util.function.BiConsumer;

/**
 * BiConsumer : Метод которого принимает 2 любых параметр и ничего не возвращает
 * mhetod : void accept(param)
 */
public class BiConsumerExample {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> sum = (a, b) -> System.out.println("sum = " +(a + b));
        sum.accept(10, 5);
    }
}
