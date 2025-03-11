package com.telran.prof.lessoons.lesson17;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsExample {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("One", "8745785"),
                new Book("Two", "54879430"),
                new Book("Three", "76758490"),
                new Book("Four", "8745785"));
        Map<String, Book> bookMap = new HashMap<>();
        for (Book book : books) {
            bookMap.put(book.getIsbn(), book);
        }
        bookMap.forEach((k, v) -> System.out.println("" + k + ":" + v));
        System.out.println();

//        Map<String, Book> collect = books.stream()
//                .collect(Collectors.toMap(book -> book.getIsbn(), book -> book));
//        System.out.println(collect);
        Map<String, Book> collect = books.stream()
                .collect(Collectors.toMap(book -> book.getIsbn(), Function.identity(),
                        (first, second) -> second));
        collect.forEach((k, v) -> System.out.println("" + k + ":" + v));

        //Collectors.toSet
        Set<String> collect1 = books.stream()
                .map(book -> book.getIsbn())
                .collect(Collectors.toSet());
        System.out.println(collect1);

        //Collector.joining
        String[] strings = {"Hello", "Java", "Application"};
        String collect2 = Arrays.stream(strings)
                .collect(Collectors.joining(" ", "[", "]"));
        System.out.println(collect2);

        //Collectors.groupingBy
        //one, two, three, four, five, six
        //key, List<String>
        //3 - one, two, six
        //4 - four, five
        //5 - three
        List<String> words = Arrays.asList("one", "two", "three", "four", "five", "six");
        Map<Object, List<String>> wordsMap = new HashMap<>();

        for (String word : words) {
            if(!wordsMap.containsKey(word.length())){
                wordsMap.put(word.length(), new ArrayList<>());
            }
            List<String> strings1 = wordsMap.get(word.length());
            strings1.add(word);
        }
        System.out.println(wordsMap);

        Map<Integer, List<String>> collect3 = words.stream()
                .collect(Collectors.groupingBy(s -> s.length(), Collectors.toList()));
        System.out.println(collect3);

        List<Fruit> fruits = Arrays.asList(
                new Fruit("Lemon", 100, Category.MIDDLE),
                new Fruit("Apple", 120, Category.MIDDLE),
                new Fruit("Pineapple", 250, Category.HIGH),
                new Fruit("Carrot", 50, Category.LOW),
                new Fruit("Potato", 30, Category.LOW));
        Map<Category, List<Fruit>> collect4 = fruits.stream()
                .collect(Collectors.groupingBy(fruit -> fruit.getCategory(), Collectors.toList()));
        System.out.println(collect4);
        collect4.forEach((k, v) -> System.out.println("" + k + ":" + v));

    }
}
