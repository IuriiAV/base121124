package com.telran.base.lesson4;

public class MethodCallExampleThree {

    public static void main(String[] args) {
        String result = getGreetings();
        System.out.println("Greetings : " + result);
        int code = getCode();
        System.out.println("Code is " + code);
    }

    //3 - Метод ничего не принимает, но, что-то возвращает
    public static String getGreetings() {
        String text = "Hello! Hello! Hello!";
        return text;
    }

    public static int getCode() {
        return 765;
    }
}
