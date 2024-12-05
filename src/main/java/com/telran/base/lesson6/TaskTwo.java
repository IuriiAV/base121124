package com.telran.base.lesson6;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        System.out.println("Please input a day of week");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();

        checkDay(data);
        String result = checkDayWithTernary(data);
        System.out.println(result);
    }

    private static void checkDay(String data) {
        switch (data) {
            case "Monday", "Thursday", "Wednesday", "Tuesday", "Friday" -> System.out.println("It`s a work day");
            case "Sunday", "Saturday" -> System.out.println("Relax");
        }
    }

    public static String checkDayWithTernary(String data) {
//        String returnResult = "It`s a work day";
//        if ("Sunday".equals(data) || "Saturday".equals(data)) {
//            returnResult = "Relax";
//        }
//        return returnResult;

        return ("Sunday".equals(data) || "Saturday".equals(data)) ? "Relax" : "It`s a work day";
    }
}
