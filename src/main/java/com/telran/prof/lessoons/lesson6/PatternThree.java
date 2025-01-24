package com.telran.prof.lessoons.lesson6;

import java.util.ArrayList;
import java.util.List;

/**
 * Шаблон 3:
 * Есть список, из элементов нужно оставить одно значение
 * Например сумму всех элементов, предложение из строк и тд
 */

public class PatternThree {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(65);
        integers.add(36);
        integers.add(89);
        integers.add(5);
        integers.add(8889);

        System.out.println("Sum of list is " + getSum(integers));
    }

    public static int getSum(List<Integer> integers) {
        int sum = 0;
        for (Integer value : integers) {
            sum += value; //sum = sum + value;
        }

        return sum;
    }
}
