package com.telran.prof.lessons.lesson4.overloadexample;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c){
        return a + b + c;
    }

    public int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public double sum(double a, double b){
        return a + b;
    }
}
