package com.telran.prof.lessontwo.bankapp;

/**
 * Переопределение - это написание своей собственной логики в классе наследнике,
 * метода, который уже существует в классе родителе
 */
public class MobileEuroBank extends MobileBank {

    @Override
    public void transferMoney(int amount) {
        System.out.println("Transfer  " + amount + " money via SEPA transfer");
    }
}
