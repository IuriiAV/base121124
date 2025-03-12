package com.telran.prof.lessons.lesson17.homework;

import java.util.List;
import java.util.stream.Collectors;

public class HW {

    public static void main(String[] args) {
        //Task 1
        List<String > names = List.of("Alice", "Bob", "Andrew", "Charlie", "Anna");
        List<String> collect = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(collect);

        //Task 2
        List<Integer> numbers = List.of(3, 7, 2, 9, 5);

        List<Integer> maxNumber = numbers.stream()
                .max((a, b) -> a-b)
                .stream().collect(Collectors.toList());
        System.out.println(maxNumber);

        //Task 3

        List<String> wordsTaskThree = List.of("apple", "banana", "kiwi");

        List<Integer> lengthString = wordsTaskThree.stream()
                .map(word -> word.length())
                .collect(Collectors.toList());
        System.out.println(lengthString);

        //Task 4

        List<String> wordsTaskFour = List.of("Java", "Stream", "API");

        String collectString = wordsTaskFour.stream()
                .collect(Collectors.joining(", "));
        System.out.println(collectString);

        //Task 5

        List<Integer> numbersTaskFive = List.of(1, 2, 3, 4, 5, 6);

        long count = numbersTaskFive.stream()
                .filter(number -> number % 2 == 0)
                .count();
        System.out.println(count);


    }
}
