package com.telran.base.lesson5;

import java.util.Scanner;

/**
 * if (условие) {
 * код, выполняемый если условие в круглых скобках истинно
 * } else {
 * код, выполняемый если условие в круглых скобках ложно
 * }
 *
 * Auto format code : WIN ctrl+alt+l , MAC : option+command+l
 */
public class ExampleIfElse {

    public static void main(String[] args) {
        System.out.println("Please input number 1: ");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        if (data == 1) {
            System.out.println("Your input is correct");
        } else {
            System.out.println("Your input is incorrect");
        }

        scanner.close();
    }
}
