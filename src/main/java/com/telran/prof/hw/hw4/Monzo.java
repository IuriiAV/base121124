package com.telran.prof.hw.hw4;

public class Monzo extends ATM {

    public Monzo(String bankName, Currency currency, int balance) {
        super(bankName, currency, balance);
    }

    @Override
    public void withdrawalMoney(CreditCard creditCard, int sum) {
        if (sum <= getBalance()) {
            setBalance(getBalance() - sum);
            creditCard.setCreditCardBalance(creditCard.getCreditCardBalance() + sum);
            System.out.println("Withdrawal successful! Your balance in Monzo Bank: " + getBalance());
            System.out.println("Your credit card balance: " + creditCard.getCreditCardBalance());
        } else {
            System.out.println("Insufficient funds in the Monzo Bank account. Enter a different amount. Your balance: " + getBalance());
        }
    }

    @Override
    public void depositMoney(CreditCard creditCard, int sum) {
        if (sum <= creditCard.getCreditCardBalance()) {
            setBalance(getBalance() + sum);
            creditCard.setCreditCardBalance(creditCard.getCreditCardBalance() - sum);
            System.out.println("Deposit successful! Your balance in Monzo Bank: " + getBalance());
        } else {
            System.out.println("Insufficient funds in your Credit Card balance. Enter a different amount. Your credit card balance: " + creditCard.getCreditCardBalance());
        }
    }

    @Override
    public boolean checkPin(CreditCard creditCard, String pin) {
        if (pin.contains(creditCard.getPin())) {
            System.out.println("You have successfully logged in to the Monzo bank.");
            return true;
        }
        return false;
    }
}
