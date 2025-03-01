package com.telran.prof.lessoneight;

import java.util.Objects;

public class Book {

    private String title;

    private int pages;

    private Autor autor;

    public Book(String title, int pages, Autor autor) {
        this.title = title;
        this.pages = pages;
        this.autor = autor;
    }

     @Override
    public boolean equals(Object obj) {
        //1 null
        if (obj == null) {
            return false;
        }
        //2
        if (this == obj) {
            return true;
        }
        //3
        if (!(obj instanceof Book)) {
            return false;
        }

        Book book = (Book) obj;

        return this.title.equals(book.title) && this.pages == book.pages && this.autor.equals(book.autor);
    }


}
