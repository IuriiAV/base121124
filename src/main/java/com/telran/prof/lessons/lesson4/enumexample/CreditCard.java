package com.telran.prof.lessons.lesson4.enumexample;

public class CreditCard {

    private String number;

    private Currency currency;

    public CreditCard(String number, Currency currency) {
        this.number = number;
        this.currency = currency;
    }

    public String getNumber() {
        return number;
    }

    public Currency getCurrency() {
        return currency;
    }
}
