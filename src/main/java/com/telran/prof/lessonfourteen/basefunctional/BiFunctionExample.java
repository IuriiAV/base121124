package com.telran.prof.lessonfourteen.basefunctional;

import java.util.function.BiFunction;

/**
 * BiFunction : Метод этого интерфейса принимает два параметра любого типа и возвращает
 * значение любого типа
 * Тип принимаемого и возвращаемого значения может быть одинаковый или разный
 * method F apply(E e, K k)
 */
public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(10, 5));

        BiFunction<Integer, Integer, Double> div = (a, b) -> a / (double) b;
        System.out.println(div.apply(7, 3));
    }
}
