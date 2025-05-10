package com.telran.prof.lessons.homework._14_01_25;

abstract class ATM {
    protected String bankName;
    protected int atmBalance;
    protected String currencyType;

    public ATM(String bankName, int atmBalance, String currencyType) {
        this.bankName = bankName;
        this.atmBalance = atmBalance;
        this.currencyType = currencyType;
    }

    public abstract boolean withdraw(CreditCard card, int amount);

    public abstract void deposit(CreditCard card, int amount);

    public boolean verifyPin(CreditCard card, int pin) {
        return card.getPin()== pin;
    }

    public String getBankName() {
        return bankName;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance) {
        this.atmBalance = atmBalance;
    }

    public String getCurrencyType() {
        return currencyType;
    }
}
