package com.telran.prof.lessons.homework._14_01_25;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
        ATM[] atms = {
                new KfWATM(5000),
                new KommerzATM(3000),
                new SparkasseATM(7000),
        };

        CreditCard card = new CreditCard("1111 2222 3333 4444", 1234, 1000, "EU");

        for (ATM atm : atms) {
            if (atm instanceof Converter) {
                System.out.println(atm.getBankName() + " Банкомат поддерживает конвертацию валют");
                SparkasseATM sparkasseATM = (SparkasseATM) atm;

                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите PIN-код: ");
                int enteredPin = scanner.nextInt();

                if (sparkasseATM.verifyPin(card, enteredPin)) {
                    System.out.println("Авторизация прошла успешно!");

                    System.out.println("Введите сумму для снятия в евро:");
                    int amountInEu = scanner.nextInt();

                    int amountInUSD = sparkasseATM.convert(amountInEu);
                    System.out.println("Конвертированная сумма в USD: " + amountInUSD);

                    if (sparkasseATM.withdraw(card, amountInUSD)) {
                        System.out.println("Вывод средств прошел успешно!");
                    } else {
                        System.out.println("Не удалось снять средства: недостаточный средств.");
                    }
                }else {
                    System.out.println("неверный PIN-код");
                }

                break;
            }
        }

        System.out.println("\n--- Итоговая информация ---");
        System.out.println(card);
        for (ATM atm : atms) {
            System.out.println(atm.getBankName() + " Баланс банкомата: " + atm.getAtmBalance());
        }
    }
}
