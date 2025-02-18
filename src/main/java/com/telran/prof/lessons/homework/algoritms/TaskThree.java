package com.telran.prof.lessons.homework.algoritms;

import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();
        System.out.println(a + " в степени " + b + " равен = " + incrementOfNumber(a, b));
    }

    public static double incrementOfNumber(double a, double b) {
        if (b == 0) {
            return 1;
        } else if (b < 0) {
            return 1 / (a * incrementOfNumber(a, -b - 1));
        }

        else {
            return a * incrementOfNumber(a, b -1);
        }
    }
}
