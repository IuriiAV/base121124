package com.telran.base.lesson6;

import java.util.Scanner;

/**
 * switch (expression) {
 * case 1 :
 * //code to execute A
 * break;
 * <p>
 * case 2 :
 * //code to execute B
 * break;
 * <p>
 * case 3 :
 * //code to execute C
 * break;
 * <p>
 * case 4 :
 * case 5 :
 * case 6 :
 * //code to execute D
 * break;
 * <p>
 * default:
 * //code to execute
 * }
 * <p>
 * В качестве выражения для сравнения используются либо строка, число, буква,
 * либо спец класс Enum
 */
public class SwitchCaseExample {

    public static void main(String[] args) {
        System.out.println("Please input number from 0 to 5: ");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        scanner.close();

        switch (data) {
            case 1:
                System.out.println("Your input 1");
                break;
            case 3:
                System.out.println("Your input 3");
                System.out.println("Hello");
                break;
            case 2:
            case 4:
                System.out.println("You are the best!");
                break;
            case 5:
            case 0:
                System.out.println("It is a corner number");
                break;
            default:
                System.out.println("Your input not in 0 to 5");
        }
    }
}
