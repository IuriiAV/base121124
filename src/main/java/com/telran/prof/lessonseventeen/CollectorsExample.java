package com.telran.prof.lessonseventeen;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsExample {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("One", "123234"),
                new Book("Two", "3424"),
                new Book("Three", "3423234"),
                new Book("Four", "123234"));
        //key - isbn
        //value - book
        Map<String, Book> bookMap = new HashMap<>();
        for (Book book : books) {
            bookMap.put(book.getIsbn(), book);
        }
        bookMap.forEach((k, v) -> System.out.println("" + k + ":" + v));
        System.out.println();

        //Collectors.toMap
        Map<String, Book> collect = books.stream()
                .collect(Collectors.toMap(book -> book.getIsbn(),
                        Function.identity(),
                        (first, second) -> second));
        collect.forEach((k, v) -> System.out.println("" + k + ":" + v));

        //Collectors.toSet
        Set<String> collect1 = books.stream().map(book -> book.getIsbn())
                .collect(Collectors.toSet());
        System.out.println(collect1);

        //Collectors.joining
        String[] strings = {"Hello", "Java", "Application"};
        String collect2 = Arrays.stream(strings)
                .collect(Collectors.joining(" ", "[", "]"));
        System.out.println(collect2);

        //Collectors.groupingBy
        // one , two, three, four, five, six
        //key , List<String>
        // 3 - one,two,six
        // 4 - four, five
        // 5 - three

        List<String> list = Arrays.asList("one", "two", "three", "four", "five", "six");
        HashMap<Integer, List<String>> hashMap = new HashMap<>();
        for (String word : list) {
            if (!hashMap.containsKey(word.length())) {
                hashMap.put(word.length(), new ArrayList<>());
            }
            List<String> strings1 = hashMap.get(word.length());
            strings1.add(word);
        }
        System.out.println(hashMap);

        Map<Integer, List<String>> collect3 = list.stream()
                .collect(Collectors.groupingBy(s -> s.length(), Collectors.toList()));
        System.out.println(collect3);

        List<Fruit> fruits = Arrays.asList(
                new Fruit("Lemon", 100, Category.MIDDLE),
                new Fruit("Apple", 120, Category.MIDDLE),
                new Fruit("Pineapple", 250, Category.HIGH),
                new Fruit("Carrot", 50, Category.LOW),
                new Fruit("Potato", 30, Category.LOW));

        // key   :  Cateogory
        // value :  List<Fruit>
        Map<Category, List<Fruit>> collect4 = fruits.stream()
                .collect(Collectors.groupingBy(fruit -> fruit.getCategory(), Collectors.toList()));
        System.out.println(collect4);

        collect4.forEach((k, v) -> System.out.println("" + k + ":" + v));


    }
}
