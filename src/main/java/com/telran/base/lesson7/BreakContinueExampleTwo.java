package com.telran.base.lesson7;

import java.util.Scanner;

public class BreakContinueExampleTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please input Y or N");
            String data = scanner.next();
            if ("Y".equals(data)) {
                System.out.println("Ok! Lets go");
                break;
            }
            if ("N".equals(data)) {
                System.out.println("Bye");
                break;
            }
        }
    }
}
