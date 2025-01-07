package com.telran.prof.lessons.lesson2.bankapp;

/**
 * Переопределение - это написание совей собственной логики в классе наследнике,
 * метода, который уже существует в классе родители
 */
public class MobileEuroBank extends MobileBank{

    @Override
    public void transferMoney(int amount) {
        System.out.println("Transfer " + amount +" money via SEPA transfer");
    }
}
