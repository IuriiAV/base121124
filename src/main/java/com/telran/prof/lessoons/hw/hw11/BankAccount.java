package com.telran.prof.lessoons.hw.hw11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {

    private double balance;

    public void deposit(double amount) throws NegativeDepositException {
        if (amount < 0) {
            throw new NegativeDepositException("Negative deposit");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        }
        balance -= amount;
    }
}
