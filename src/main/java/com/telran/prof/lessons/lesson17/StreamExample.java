package com.telran.prof.lessons.lesson17;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("One", "123456"),
                new Book("Two", "126332"),
                new Book("Three", "1823134"),
                new Book("Four", "842344"));
        System.out.println(getIsbnList(books));

    }

    private static List<String> getIsbnList(List<Book> books){
        List<String> isbns = new ArrayList<>();
        for (Book book : books){
            isbns.add(book.getIsbn());
        }
        return isbns;
    }

    private static List<String> getIsbnListUseStreamApi(List<Book> books){
        return books.stream()
                .map(book -> book.getIsbn())
                .collect(Collectors.toList());
    }
}
