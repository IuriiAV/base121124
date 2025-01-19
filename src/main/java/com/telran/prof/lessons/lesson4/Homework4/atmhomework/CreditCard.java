package com.telran.prof.lessons.lesson4.Homework4.atmhomework;

public class CreditCard {

    private String cardNumber;

    private int pin;

    private int balance;

    private Currency currency;

    public CreditCard(String cardNumber, int pin, int balance, Currency currency) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = balance;
        this.currency = currency;
    }

    public int getPin() {
        return pin;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void printInfo(){
        System.out.println("Card number: " + cardNumber + " balance: " + balance + " " + currency);
    }
}
