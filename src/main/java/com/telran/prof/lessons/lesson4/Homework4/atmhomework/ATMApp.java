package com.telran.prof.lessons.lesson4.Homework4.atmhomework;

import java.util.Scanner;

public class ATMApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard card = new CreditCard("4355-5674-0973-1234",1234, 2000, Currency.USD);
        ATM atmVBOne = new VolksBank(1000, Currency.USD);
        ATM atmDB = new DeutscheBank(1000, Currency.USD);
        ATM atmSC = new Sparkasse(2000, Currency.USD);
        ATM atmVB = new VolksBank(3000, Currency.USD);

        ATM[] atms = {atmVBOne, atmDB, atmSC, atmVB};

        System.out.print("ВВедите PIN-код: ");
        int pin = scanner.nextInt();
        for (ATM atm : atms){
            if (atm instanceof Convert){
                if(atm.verifyPin(card, pin)){
                    System.out.print("Авторизация прошла успешно!!!\nВВедите сумму для снятия: ");
                    atm.withdrawal(card,(int) ((Convert) atm).convert(scanner.nextInt()));
                    card.printInfo();

                }
            }
        }


        /**
         *         System.out.println("DeutscheBank");
         *         if (atmDB.verifyPin(card, pin)){
         *             double euros = 50;
         *             double usd = ((DeutscheBank) atmDB).convert(euros);
         *             System.out.println(euros + " EUR converted to " + usd + " USD.");
         *             atmDB.withdrawal(card, (int) usd);
         *             atmDB.deposit(card, 200);
         *         }else {
         *             System.out.println("PIN incorrect");
         *         }
         *
         *         System.out.println("\nSparkasse");
         *         if (atmSC.verifyPin(card, pin)){
         *             atmSC.withdrawal(card,300);
         *             atmSC.deposit(card, 200);
         *         }else {
         *             System.out.println("PIN incorrect");
         *         }
         *
         *         System.out.println("\nVolksBank");
         *         if (atmVB.verifyPin(card, pin)){
         *             atmVB.withdrawal(card,300);
         *             atmVB.deposit(card, 200);
         *         }else {
         *             System.out.println("PIN incorrect");
         *         }
         */

    }
}
