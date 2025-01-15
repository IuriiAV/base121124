package com.telran.prof.lessons.lesson2.bankapp;

public class MobileEuroBank extends MobileBank {

    @Override
    public void transferMoney(int amount) {
        System.out.println("Transfer " + amount + " money via SEPA transfer");
    }
}
