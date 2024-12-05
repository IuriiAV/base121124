package com.telran.base.lesson6;

import java.util.Scanner;

/**
 * data == 1
 * answer = (expression) ? (answer when expression == true)
 * : (answer when expression == false);
 * <p>
 * result = expression ? answer1 : answer2;
 * если выражение тру , то результат будет ответ1 иначе ответ 2
 * <p>
 * Analog:
 * String result;
 * if(expression) {
 * result = answer1;
 * } else {
 * result = answer2;
 * }
 * <p>
 * !!! answer1 и answer2 должны быть одного и того же типа
 */

public class TernaryExample {

    public static void main(String[] args) {
        System.out.println("1-Say hello, 2-Say bye");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        String result = getWordWithTernaryOperator(data);
        System.out.println(result);
        System.out.println(data == 1 ? getHello() : getBye());
    }

    private static String getWord(int data) {
        String answer;
        if (data == 1) {
            answer = "Hello";
        } else {
            answer = "Bye";
        }
        return answer;
    }

    private static String getWordWithTernaryOperator(int data) {
        return data == 1 ? "Hello" : "Bye";
    }

    private static String getWordRefactor(int data) {
        if (data == 1) {
            return "Hello";
        }

        return "Bye";
    }

    private static String getHello() {
        return "Hello";
    }

    private static String getBye() {
        return "Bye";
    }
}
