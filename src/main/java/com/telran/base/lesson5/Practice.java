package com.telran.base.lesson5;

/**
 * Создаем переменные a,b,c,d
 * <p>
 * Используя блок if нужно составить логические выражения:
 * 1) истина, если a < b and b == c
 * 2) истина, если a > b or c == d
 * 3) истина, если a not equals b
 */
public class Practice {

    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        int c = 10;
        int d = 10;

        if (a < b && b == c) {
            System.out.println("One");
        }
        if (a > b || c == d) {
            System.out.println("Two");
        }
        if (a != b) {
            System.out.println("Three");
        }
    }
}
