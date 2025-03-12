package com.telran.prof.lessons.lessons16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExampleFour {

    public static void main(String[] args) {
        List<Integer> one = Arrays.asList(1,2,3,4);
        List<Integer> two = Arrays.asList(5,6,7,8);

        List<List<Integer>> all = Arrays.asList(one, two);

        for (List<Integer> number : all){
            for (Integer i : number){
                System.out.print(i * 2 + " ");
            }
        }
        //
        List<Integer> numbers = one.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println(numbers);

        List<Integer> collect = all.stream()
                .flatMap(integers -> integers.stream())
                .map(integer -> integer * 2)
                .collect(Collectors.toList());
                //.forEach(integer -> System.out.print(" " + integer));
        System.out.println(collect);

    }
}
