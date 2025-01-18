package com.telran.prof.lessoons.lesson2.bankApp;

public class MobileEuroBank extends MobileBank{

    @Override
    public void transferMoney(int amount) {
        System.out.println("Transfer " + amount + " money via SEPA transfer");
    }
}
