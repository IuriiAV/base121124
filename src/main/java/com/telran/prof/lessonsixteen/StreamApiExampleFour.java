package com.telran.prof.lessonsixteen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExampleFour {

    public static void main(String[] args) {
        List<Integer> one = Arrays.asList(1, 2, 3, 4);
        List<Integer> two = Arrays.asList(5, 6, 7, 8);

        List<List<Integer>> all = Arrays.asList(one, two);
        for (List<Integer> integers : all) {
            for (Integer value : integers) {
                System.out.println(" " + value * 2);
            }
        }

        // use only "one" - > generate list with element * 2
        List<Integer> collect = one.stream()
                .map(integer -> integer * 2)
                .collect(Collectors.toList());
        System.out.println(collect);

       all.stream() //stream of collection
               .flatMap(integers -> integers.stream()) // stream all elements from collections
               .map(integer -> integer * 2)
               .forEach(integer -> System.out.print(" " + integer));

    }
}
