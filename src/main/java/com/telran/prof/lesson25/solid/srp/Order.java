package com.telran.prof.lesson25.solid.srp;

public class Order {

    private Book book;

    private int quantity;

    private double totalPrice;

    public void addBook(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
        calculateTotalPrice();
    }

    private void calculateTotalPrice() {
        this.totalPrice = quantity * book.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

//    public void saveOrderToDatabase() {
//        // connect to database
//        // ... ... settings etc
//        // db.save(this);
//    }
//
//    public void send() {
//        //sendByEmail(this);
//    }
}
