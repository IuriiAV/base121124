package com.telran.prof.lessons.lesson20.homework.tasktwo;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();

        boolean sw = true;
        while (sw){
            System.out.println("Select action: \n1) Check balance \n2) top up your account \n3) Withdraw money");
            int number = scanner.nextInt();
            switch (number){
                case 1 -> System.out.println("Your balance is: " + bankAccount.getBalance());
                case 2 -> {
                    try{
                        System.out.println("Input amount: ");
                        bankAccount.deposit(scanner.nextDouble());
                        System.out.println("Your balance is: " + bankAccount.getBalance());
                    }catch (NegativeDepositException e){
                        e.getMessage();
                    }
                }
                case 3 -> {
                    try{
                        System.out.println("Input amount: ");
                        bankAccount.withdraw(scanner.nextDouble());
                        System.out.println("Your balance is: " + bankAccount.getBalance());
                    }catch (InsufficientFundsException e){
                        e.getMessage();
                    }
                }
                default -> System.out.println("Invalid commands");
            }
            System.out.println("Do you want to do something else?");
            String switchAction = scanner.next();
            switch (switchAction){
                case "Yes", "yes", "ye" -> sw = true;
                default -> sw = false;
            }
        }

    }
}
