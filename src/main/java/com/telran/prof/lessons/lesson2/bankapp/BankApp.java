package com.telran.prof.lessons.lesson2.bankapp;

import com.telran.base.lesson6.SwitchCaseExample;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
        System.out.println("Please input amount money to transfer : ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        System.out.println("1-SWIFT, 2-SEPA");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 ->{
                MobileBank mobileBank = new MobileBank();
                transferMoneyViaMobileBank(mobileBank, amount);
            }
            case 2 ->{
                MobileEuroBank mobileEuroBank =new MobileEuroBank();
                transferMoneyViaMobileBank(mobileEuroBank, amount);
            }
        }
    }

    private static void transferMoneyViaMobileBank(MobileBank mobileBank, int amount){
        mobileBank.transferMoney(amount);
    }
}
