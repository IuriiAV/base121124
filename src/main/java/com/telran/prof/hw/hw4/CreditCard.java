package com.telran.prof.hw.hw4;

public class CreditCard{

    private String number;

    private String pin;

    private int creditCardBalance;

    private Currency currency;

    public CreditCard(String number, String pin, int creditCardBalance, Currency currency) {
        this.number = number;
        this.pin = pin;
        this.creditCardBalance = creditCardBalance;
        this.currency = currency;
    }

    public String getPin() {
        return pin;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCreditCardBalance() {
        return creditCardBalance;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCreditCardBalance(int creditCardBalance) {
        this.creditCardBalance = creditCardBalance;
    }
}
