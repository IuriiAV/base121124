package com.telran.prof.lessons.lesson6;

import java.util.ArrayList;
import java.util.List;

public class PatternThree {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(31);
        integers.add(4);
        integers.add(7);
        integers.add(2);
        integers.add(6);
        integers.add(1);

        System.out.println("Sum of list is " + getSum(integers));
    }

    public static int getSum(List<Integer> integers){
        int sum = 0;
        for (Integer value : integers){
            sum += value;
        }

        return sum;
    }
}
