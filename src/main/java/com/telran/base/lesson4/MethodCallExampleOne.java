package com.telran.base.lesson4;

public class MethodCallExampleOne {

    private static void printGreetings() {
        System.out.println("2 - Start method printGreetings");
        System.out.println("Hello All!");
        System.out.println("3 - End method printGreetings");
    }

    public static void main(String[] args) {
        System.out.println("1 - Start method main");
        //Вызов метода - обращение к нему по имени
        printGreetings();
        System.out.println("4 - End method main");
    }


}
