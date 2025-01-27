package com.telran.prof.lessons.lesson4.Homework4.atmhomework;

public class VolksBank extends ATM{

    public VolksBank(int totalAmount, Currency currencyType) {
        super("VolksBank", totalAmount, currencyType);
    }

    @Override
    public void withdrawal(CreditCard card, int amount) {
        if (amount > totalAmount){
            System.out.println("ATM does not have enough funds.");
            return;
        }
        if (amount < totalAmount){
            System.out.println("Insufficient balance in card.");
        }

        card.setBalance(card.getBalance() - amount);
        totalAmount -= amount;
        System.out.println("Withdrawal successful. New card balance: " + card.getBalance());
    }

    @Override
    public void deposit(CreditCard card, int amount) {
        card.setBalance(card.getBalance() + amount);
        totalAmount += amount;
        System.out.println("Deposit successful. New card balance: " + card.getBalance());

    }
}
