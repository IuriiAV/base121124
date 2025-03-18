package com.telran.prof.lessonseventeen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleApp {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("One", "123234"),
                new Book("Two", "3424"),
                new Book("Three", "3423234"),
                new Book("Four", "23423"));
        System.out.println(getIsbnList(books));
    }

    private static List<String> getIsbnList(List<Book> books) {
        List<String> isbns = new ArrayList<>();
        for (Book book : books) {
            isbns.add(book.getIsbn());
        }
        return isbns;
    }

    private static List<String> getIsbnListUseStreamApi(List<Book> books) {
        return books.stream()
                .map(book -> book.getIsbn())
                .collect(Collectors.toList());
    }

}
