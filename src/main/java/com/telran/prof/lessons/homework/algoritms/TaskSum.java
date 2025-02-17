package com.telran.prof.lessons.homework.algoritms;

public class TaskSum {

    public static void main(String[] args) {
        int number = 1234;
        System.out.println("Сумма числа: " + number + " равна = " + recursionSumOfNumber(number));
    }

    public static int recursionSumOfNumber(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + recursionSumOfNumber(n / 10);
        }
    }
}
