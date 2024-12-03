package com.telran.base.lesson5;

import java.util.Scanner;

/**
 * == - оператор сравнения в джаве
 *          if(условие) {
 *              // тело условия, выполняемый код (блок if)
 *          }
 *
 *  Если условие в круглых скобках истинно, то выполняется код
 *  в теле условия, иначе просто проходим мимо
 */
public class ExampleIf {

    public static void main(String[] args) {
        System.out.println("Please input number 1: " );
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        if (data == 1) { // true or false
            System.out.println("Your input is correct!");
        }

        System.out.println("Bye!");
        scanner.close();
    }
}
