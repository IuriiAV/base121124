package com.telran.prof.lessons.lesson17;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentApp {

    public static void main(String[] args) {
        Set<Book> booksOne = Set.of(
                new Book("Java 8", "123"),
                new Book("Spring Boot", "234"),
                new Book("Effective Java", "222"));
        Student alex = new Student(1, "Alex", booksOne);

        Set<Book> booksTwo = Set.of(
                new Book("HTML", "564"),
                new Book("Effective Java", "222"));
        Student max = new Student(2, "Max", booksTwo);

        List<Student> students = Arrays.asList(alex, max);

        students.stream()
                .map(student -> student.getBooks())
                .flatMap(books -> books.stream())
                .map(book -> book.getTitle())
                .forEach(s -> System.out.println(s));


        System.out.println();
        Set<String> collect = students.stream()
                .map(student -> student.getBooks())
                .flatMap(books -> books.stream())
                .map(book -> book.getTitle())
                .collect(Collectors.toSet());
        System.out.println(collect);

        System.out.println();
        List<String> javaBooks = students.stream()
                .map(student -> student.getBooks())
                .flatMap(books -> books.stream())
                .map(book -> book.getTitle())
                .distinct()
                .filter(word -> word.contains("Java"))
                .collect(Collectors.toList());
        System.out.println(javaBooks);

    }
}
