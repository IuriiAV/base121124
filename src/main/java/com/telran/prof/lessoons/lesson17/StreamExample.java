package com.telran.prof.lessoons.lesson17;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("One", "8745785"),
                new Book("Two", "54879430"),
                new Book("Three", "76758490"),
                new Book("Four", "788980r"));
        System.out.println(getIsbnList(books));
    }

    private static List<String> getIsbnList (List<Book> books) {
        List<String> isbhs = new ArrayList<>();
        for(Book book : books) {
            isbhs.add(book.getIsbn());
        }
        return isbhs;
    }

    private static List<String> getIsbnListUseStream (List<Book> books) {
        return books.stream()
                .map(book -> book.getIsbn())
                .collect(Collectors.toList());
    }
}
