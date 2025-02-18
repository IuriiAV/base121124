package com.telran.prof.lessons.lesson2.bankapp;

/**
 * Переопределение - это написание своей собственной логики в классе наследнике,
 * метода, который уже существует в классе родителе
 */
public class MobileEuroBank extends MobileBank{

    @Override
    public void transferMoney(int amount) {
        super.transferMoney(amount);
    }
}
