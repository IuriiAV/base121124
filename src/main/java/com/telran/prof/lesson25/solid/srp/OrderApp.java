package com.telran.prof.lesson25.solid.srp;

public class OrderApp {

    public static void main(String[] args) {
        Book one = new Book("One", 2.55);

        Order order = new Order();
        order.addBook(one,5);
        System.out.println("Total price " + order.getTotalPrice());

        OrderStorage orderStorage = new OrderStorage();
        orderStorage.save(order);
        //order.saveOrderToDatabase();

        OrderSender orderSender = new OrderSender();
        orderSender.send(order);


    }
}
