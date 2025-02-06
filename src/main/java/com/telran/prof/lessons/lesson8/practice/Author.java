package com.telran.prof.lessons.lesson8.practice;

import java.util.Objects;

public class Author {

    private String name;
    private String surName;

    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

//    @Override
//    public boolean equals(Object obj) {
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
//
//        Author author = (Author) obj;
//        return this.name.equals(author.name) && this.surName.equals(author.surName);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surName, author.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }
}
