package com.telran.prof.lessoons.lesson25.srp;

public class OrderApp {

    public static void main(String[] args) {
        Order order = new Order();
        Book one = new Book("one", 2.55);

        order.addBook(one, 5);
        System.out.println("Total price: " + order.getTotalPrice());

        OrderStorage orderStorage = new OrderStorage();
        orderStorage.save(order);
        //order.saveOrderToDataBase();

        OrderSender orderSender = new OrderSender();
        orderSender.send(order);
        //order.send();
    }
}
