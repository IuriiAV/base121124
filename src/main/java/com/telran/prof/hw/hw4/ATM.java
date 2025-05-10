package com.telran.prof.hw.hw4;

public abstract class ATM {

    protected String bankName;

    protected Currency currency;

    protected int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getBalance() {
        return balance;
    }

    public ATM(String bankName, Currency currency, int balance) {
        this.bankName = bankName;
        this.currency = currency;
        this.balance = balance;
    }

    public abstract void withdrawalMoney(CreditCard creditCard, int balance);

    public abstract void depositMoney(CreditCard creditCard, int balance);

    public abstract boolean checkPin(CreditCard creditCard, String pin);

}
