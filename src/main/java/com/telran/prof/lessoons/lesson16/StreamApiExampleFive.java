package com.telran.prof.lessoons.lesson16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExampleFive {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        Stream<Integer> stream = list.stream();
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7);

        String[] strings = {"one", "two", "three"};
        List<String> collect = Arrays.stream(strings)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
