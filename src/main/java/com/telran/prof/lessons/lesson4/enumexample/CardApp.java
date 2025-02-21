package com.telran.prof.lessons.lesson4.enumexample;

public class CardApp {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("4444 5555 4444 2222", Currency.EU);
        CreditCard creditCard1 = new CreditCard("4444 5555 2222 1111", Currency.USD);
        CreditCard[] creditCards = {creditCard, creditCard1};

        for (CreditCard card :creditCards) {
            if (card.getCurrency() == Currency.EU) {
                System.out.println("Send money to " + card.getNumber());
            }
        }

        String name = Currency.EU.name();
        System.out.println(name);
    }
}
