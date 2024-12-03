package com.telran.base.lesson5;

import java.util.Scanner;

public class ExampleReturn {

    public static void main(String[] args) {
        System.out.println("Please input number under 5: ");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        checkNumber(data);
        System.out.println("Bye!");
    }

    public static void checkNumber(int data) {
        if (data > 5) {
            return;
        }

        if ((data % 2) == 0) {
            System.out.println("Your input is even");
        } else {
            System.out.println("Your input is odd");
        }
    }
}
