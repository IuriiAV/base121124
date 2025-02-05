package com.telran.prof.lessoons.lesson8.practice;

import java.util.Objects;

public class Book {

    private String title;

    private int pages;

    private Author author;

    public Book(String title, int pages, Author author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (this == obj) {
//            return true;
//        }
//        if (!(obj instanceof Book)) {
//            return false;
//        }
//
//        Book book = (Book) obj;
//
//        return this.title.equals(book.title) && this.pages == book.pages &&
//                this.author.equals(book.author);
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pages, author);
    }
}
