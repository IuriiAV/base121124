package com.telran.prof.lessoons.lesson20.library;

public class BookNotFoundException extends RuntimeException{

    public BookNotFoundException(String message) {
        super(message);
    }
}
