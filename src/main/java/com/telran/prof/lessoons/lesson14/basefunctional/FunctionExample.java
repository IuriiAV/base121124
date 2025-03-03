package com.telran.prof.lessoons.lesson14.basefunctional;

import java.util.function.Function;

/**
 * Function: Метод этого интерфейса принимает параметр любого типа и возвращает
 * значение любого типа
 * Тип принимаемого и возвращаемого значения может быть одинаковый или разный
 * method E apply(E e)
 */

public class FunctionExample {

    public static void main(String[] args) {
        Function<Integer, Double> half = a -> a / 2.0;
        Double apply = half.apply(5);
        System.out.println(apply);

        Function<String, String> upperTranslator = text -> text.toUpperCase();
        System.out.println(upperTranslator.apply("java"));

        Function<String, String> converter = str -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char temp = str.charAt(i);
                if(Character.isDigit(temp)){
                    sb.append(temp);
                }
            }
            return sb.toString();
        };

        String res = converter.apply("fdihb75h6bhb6h5b7hb65h5jh467654");
        System.out.println(res);

        Function<Integer, Integer> sum = a -> a + 10;
        Function<Integer, Integer> mult = a -> a * 2;
        Integer resOne = sum.andThen(mult).apply(5);
        System.out.println(resOne);
        Integer resTwo = sum.compose(mult).apply(5);
        System.out.println(resTwo);
        //sum.andThen().compose().andThen().compose().apply(5);
    }
}
