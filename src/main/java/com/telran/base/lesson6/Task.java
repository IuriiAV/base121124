package com.telran.base.lesson6;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        System.out.println("Напишите день недели: ");
        Scanner scanner = new Scanner(System.in);
        String days = scanner.next().toLowerCase();

        switch (days) {
            case "monday" -> System.out.println("Тяжелый день");
            case "tuesday", "wednesday", "thursday" -> System.out.println("Работаем");
            case "friday" -> System.out.println("Радуемся");
            case "saturday", "sunday" -> System.out.println("Чилим");
            default -> System.out.println("Неправильно");
        }
        scanner.close();
    }
}
