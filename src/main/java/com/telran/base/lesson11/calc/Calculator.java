package com.telran.base.lesson11.calc;

public class Calculator {

    private String language;

    public Calculator(String language) {
        this.language = language;
    }

    public void printSum(int a, int b) {
        int sum = a + b;
        if ("Eng".equals(language)) {
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("Adi = " + sum);
        }
    }

    public void switchLanguage() {
        if ("Eng".equals(language)) {
            language = "De";
        } else {
            language = "Eng";
        }
    }
}
