package com.telran.base.lesson6;

import java.util.Scanner;

/**
 * switch(expression) {
 * case 1 -> // код для выполнения когда expression == 1;
 * case 2, 4 -> // код для выполнения когда expression == 2 или 4;
 * case 3 -> {
 * // код для выполнения когда expression == 3;
 * // код для выполнения когда expression == 2;
 * // код для выполнения когда expression == 2;
 * }
 * default -> // код для выполнения когда expression не совпало ни с чем
 * }
 */

public class SwitchCaseLambdaExample {

    public static void main(String[] args) {
        System.out.println("Please input number from 0 to 5: ");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        scanner.close();

        switch (data) {
            case 1 -> System.out.println("Your input 1");
            case 3 -> {
                System.out.println("Your input 3");
                System.out.println("Hello");
            }
            case 2, 4 -> System.out.println("You are the best!");
            case 5, 0 -> System.out.println("It is a corner number");
            default -> System.out.println("Your input not in 0 to 5");
        }
    }
}
