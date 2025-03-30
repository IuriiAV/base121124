package com.telran.prof.lessons.lesson20.homework.tasktwo;

import com.telran.prof.lessons.lesson20.library.IncorrectISBNException;

public class BankAccount {

    private double balance;

    public void deposit(double amount) {
        if (amount < 0){
            throw new NegativeDepositException("The replenishment amount " + amount + " is not sufficient");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > balance){
            throw new IncorrectISBNException("Your balance: " + balance + " is less than the replenishment amount: " + amount);
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
