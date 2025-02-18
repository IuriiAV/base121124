package com.telran.prof.lessons.homework._14_01_25;

class CreditCard {
    private final String cardNumber;
    private final int pin;
    private int balance;
    private final String currencyType;

    public CreditCard(String cardNumber, int pin, int balance, String currencyType) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = balance;
        this.currencyType = currencyType;
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

    @Override
    public String toString() {
        return "CreditCard{" + "cardNumber='" + cardNumber + '\'' +
                ", balance= " + balance +
                ", currencyType= '" + currencyType + '\'' +
                '}';
    }
}
