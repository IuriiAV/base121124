package com.telran.prof.lessons.lesson20.library;

import java.util.Scanner;

public class BookApp {

    public static void main(String[] args) {
        BookStorage bookStorage = new BookStorage();
        System.out.println("Please input isbn : ");
        Scanner scanner = new Scanner(System.in);
        String isbn = scanner.next();

        try {
            Book book = bookStorage.getByIsbn(isbn);
            System.out.println("Your book is " + book);
        } catch (IncorrectISBNException exception) {
            System.out.println(exception.getMessage());
        } catch (BookNotFoundException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
    }


}

