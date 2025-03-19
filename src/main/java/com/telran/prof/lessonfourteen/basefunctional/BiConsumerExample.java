package com.telran.prof.lessonfourteen.basefunctional;

import java.util.function.BiConsumer;
/**
 * BiConsumer : Метод которого принимает два любых параметр и ничего не возвращает
 * method : void accept(param)
 */
public class BiConsumerExample {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> sum = (a, b) -> System.out.println("sum = " + (a + b));
        sum.accept(10,5);
    }
}
