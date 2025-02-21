package com.telran.prof.lessons.homework._14_01_25;

public class SparkasseATM extends ATM implements Converter {

    public SparkasseATM(int atmBalance) {
        super("Sparkasse", atmBalance, "USD");
    }

    @Override
    public int convert(int amountInEu) {
        final double conversionRate = 1.1;
        return (int) (amountInEu * conversionRate);
    }

    @Override
    public boolean withdraw(CreditCard card, int amount) {
        if (atmBalance >= amount && card.getBalance() >= amount) {
            atmBalance -= amount;
            card.setBalance(card.getBalance() - amount);
            System.out.println("Успешное снятие денег через банкомат Sparkasse");
            return true;
        } else {
            System.out.println("Недостаточное количество в банкомате или на карте");
            return false;
        }
    }

    @Override
    public void deposit(CreditCard card, int amount) {
        atmBalance += amount;
        card.setBalance(card.getBalance() + amount);
        System.out.println("Успешное пополнение счета в банкомате KfW.");
    }
}
