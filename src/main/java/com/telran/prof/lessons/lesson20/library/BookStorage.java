package com.telran.prof.lessons.lesson20.library;

import java.util.HashMap;
import java.util.Map;

public class BookStorage {

    private Map<String, Book> storage = new HashMap<>();

    public BookStorage() {
        init();
    }

    private void init(){
        Book bookOne = new Book("12345A", "Book One");
        Book bookTwo = new Book("12346B", "Book Two");
        storage.put(bookOne.getIsbn(), bookOne);
        storage.put(bookTwo.getIsbn(), bookTwo);
    }

    public Book getByIsbn(String isbn){
        if (isbn.length() != 6 ){
            throw new IncorrectISBNException("ISBN " + isbn + " is incorrect");
        }
        if (!storage.containsKey(isbn)){
            throw new BookNotFoundException("Book with isbn " + isbn + " not found");
        }
        return storage.get(isbn);
    }
}
