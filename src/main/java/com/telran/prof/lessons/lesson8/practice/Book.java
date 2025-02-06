package com.telran.prof.lessons.lesson8.practice;

import com.telran.prof.lessons.lesson8.Cat;

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
//    public boolean equals(Object obj) {//1
//        if (obj == null) {
//            return false;
//        }
//        //2
//        if (this == obj) {
//            return true;
//        }
//        //3 сравнить является ли объект экземпляром класса
//        if (!(obj instanceof Author)) {
//            return false;
//        }
//        Book book = (Book) obj;
//        return this.title.equals(book.title) && this.pages == book.pages
//                && this.author.equals(book.author);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pages, author);
    }
}
