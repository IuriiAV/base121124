package com.telran.prof.lessoneight.practice;

public class Author {

    private String name;

    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        //2
        if (this == obj) {
            return true;
        }
        //3
        if (!(obj instanceof Author)) {
            return false;
        }

        Author author = (Author) obj;

        return this.name.equals(author.name) && this.surname.equals(author.surname);
    }
}
