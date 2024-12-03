package com.telran.base.lesson5;

import java.util.Scanner;

/**
 * if(условие1) {
 * if(условие2) {
 * выполняется код, когда условие 1 истинно и условие 2 истинно
 * } else {
 * выполняется код, когда условие 1 истинно и условие 2 ложно
 * }
 * } else {
 * выполняется если условие 1 ложно
 * }
 */
public class ExampleNestedIf {

    public static void main(String[] args) {
        System.out.println("Please input number under 10: ");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        // % оператор получения остатка от деления
        if (data <= 10) {
            System.out.println("Your input is correct");
            if ((data % 2) == 0) {
                System.out.println("Your number is even");
            } else {
                System.out.println("Your number is odd");
            }
        } else {
            System.out.println("Your input is incorrect");
        }


        scanner.close();
    }
}
