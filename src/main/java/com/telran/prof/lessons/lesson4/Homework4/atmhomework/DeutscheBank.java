package com.telran.prof.lessons.lesson4.Homework4.atmhomework;

public class DeutscheBank extends ATM implements Convert {


    public DeutscheBank(int totalAmount, Currency currencyType) {
        super("DeutscheBank", totalAmount, currencyType);
    }

    @Override
    public void withdrawal(CreditCard card, int amount) {
        if (amount > totalAmount) {
            System.out.println("ATM does not have enough funds.");
            return;
        }
        if (amount < totalAmount) {
            System.out.println("Insufficient balance in card.");
        }

        setTotalAmount(getTotalAmount() - amount);
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

    @Override
    public double convert(double amountInEUR) {
        final double conversionRate = 1.1;
        return amountInEUR * conversionRate;
    }
}
