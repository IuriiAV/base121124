package com.telran.prof.lessoneight;

public class BookApp {

    public static void main(String[] args) {

        Book bookOne = new Book("One" , 150 , new Autor("Surname" , "Name"));
        Book bookTwo = new Book("One" , 150 , new Autor("Surname" , "Name"));

        if (bookOne.equals(bookTwo)){
            System.out.println("We have to equals book");
        }
    }
}
