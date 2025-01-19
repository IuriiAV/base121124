package com.telran.prof.lessons.lesson4.Homework4.atmhomework;

public abstract class ATM {

    protected String bankName;
    protected int totalAmount;
    protected Currency currencyType;

    public ATM(String bankName, int totalAmount, Currency currencyType) {
        this.bankName = bankName;
        this.totalAmount = totalAmount;
        this.currencyType = currencyType;
    }

    public abstract void withdrawal(CreditCard card, int amount);

    public abstract void deposit(CreditCard card, int amount);

    public boolean verifyPin(CreditCard card,  int pin){
        return card.getPin() == pin;
    }

    public String getBankName() {
        return bankName;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Currency getCurrencyType() {
        return currencyType;
    }

}
