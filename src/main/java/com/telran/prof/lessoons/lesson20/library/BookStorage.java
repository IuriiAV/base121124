package com.telran.prof.lessoons.lesson20.library;

import java.util.HashMap;
import java.util.Map;

public class BookStorage {

    private Map<String, Book> storage = new HashMap<>();

    public BookStorage() {
        init();
    }

    private void init() {
        Book book_one = new Book("12345A", "Book One");
        Book book_two = new Book("12345B", "Book Two");
        storage.put(book_one.getIsbn(), book_one);
        storage.put(book_two.getIsbn(), book_two);
    }

    public Book getByIsbn(String isbn) {
        if (isbn.length() != 6) {
            throw new IncorrectISBNException("ISBN " + isbn + " is incorrect");
        }
        if (!storage.containsKey(isbn)) {
            throw new BookNotFoundException("Book with " + isbn + " not found");
        }
        return storage.get(isbn);
    }
}
