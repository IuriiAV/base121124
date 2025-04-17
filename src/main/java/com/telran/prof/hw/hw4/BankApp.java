package com.telran.prof.hw.hw4;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard creditCard = new CreditCard("7777 8989 8989", "kira", 5000, Currency.EUR);
        Monzo monzo = new Monzo("Monzo", Currency.USD, 90);
        BNP bnp = new BNP("BNP", Currency.USD, 800);
        Revolut revolut = new Revolut("Revolut", Currency.USD, 85);

        ATM[] banks = {monzo, bnp, revolut};

        while (true) {
            System.out.println("Enter your pin: ");
            String pin = scanner.next();
            if (checkPin(banks, creditCard, pin)) {
                break;
            }
            System.out.println("Invalid password, try again.");
        }

        while (true) {
            System.out.println("Select a service: 1 - Withdraw; 2 - Deposit; 3 - View balance; 4 - Exit");
            int data = scanner.nextInt();

            switch (data) {
                case 1 -> {
                    System.out.println("Enter the amount to be withdrawn in USD");
                    int sumInUSD = scanner.nextInt();
                    withdrawn(banks, sumInUSD, creditCard);
                }
                case 2 -> {
                    System.out.println("Enter deposit amount in EUR");
                    int sumInEUR = scanner.nextInt();
                    deposit(banks, sumInEUR, creditCard);
                }
                case 3 -> checkBalance(banks);
                case 4 -> {
                    return;
                }
                default -> System.out.println("Try again");
            }
        }
    }

    public static void withdrawn(ATM[] banks, int sumInUSD, CreditCard creditCard) {
        for (ATM bank : banks) {
            if (bank instanceof Converter) {
                double conversion = ((Converter) bank).convertToEUR(sumInUSD);
                bank.withdrawalMoney(creditCard, (int) conversion);
            }
        }
    }

    public static void deposit(ATM[] banks, int sumInEUR, CreditCard creditCard) {
        for (ATM bank : banks) {
            if (bank instanceof Converter) {
                double conversion = ((Converter) bank).convertToUSD(sumInEUR);
                bank.depositMoney(creditCard, (int) conversion);
            }
        }
    }

    public static void checkBalance(ATM[] banks) {
        for (ATM bank : banks) {
            if (bank instanceof Converter) {
                System.out.println("Your current bank account balance: " + bank.getBalance());
            }
        }
    }

    public static boolean checkPin(ATM[] banks, CreditCard creditCard, String pin) {
        for (ATM bank : banks) {
            if (bank instanceof Converter) {
                if (bank.checkPin(creditCard, pin)) {
                    return true;
                }
            }
        }
        return false;
    }
}
