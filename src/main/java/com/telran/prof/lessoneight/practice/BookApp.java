package com.telran.prof.lessoneight.practice;

public class BookApp {

    public static void main(String[] args) {
        Book bookOne = new Book("One", 150, new Author("Name", "Surname"));
        Book bookTwo = new Book("One", 150, new Author("Name", "Surname"));

        if (bookOne.equals(bookTwo)) {
            System.out.println("We have two equals book");
        }
    }
}
