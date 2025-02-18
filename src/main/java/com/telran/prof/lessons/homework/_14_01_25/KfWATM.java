package com.telran.prof.lessons.homework._14_01_25;

class KfWATM extends ATM {

    public KfWATM(int atmBalance) {
        super("KfW", atmBalance, "USD");
    }

    @Override
    public boolean withdraw(CreditCard card, int amount) {
        if (atmBalance >= amount && card.getBalance() >= amount) {
            atmBalance -= amount;
            card.setBalance(card.getBalance() - amount);
            System.out.println("Успешное снятие денег через банкомат KfW");
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
