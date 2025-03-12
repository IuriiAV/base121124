package com.telran.prof.lessonsix;

import java.util.ArrayList;
import java.util.List;

/**
 * Шаблон 3:
 * Есть список, из элементов списка нужно составить одно значение
 * Например сумму всех элементов, предложение из строк и тд
 */
public class PatternThree {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(2);
        integers.add(11);
        integers.add(6);

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
