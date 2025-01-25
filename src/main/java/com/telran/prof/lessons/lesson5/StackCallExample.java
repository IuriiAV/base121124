package com.telran.prof.lessons.lesson5;

public class StackCallExample {

    public static void main(String[] args) {
        System.out.println("1 - call from start main");
        method1();
        System.out.println("7 - end from method main");

    }

    public static void method1(){
        System.out.println("2 - call from start method1");
        method2();
        System.out.println("6 - call from end method1");
    }

    public static void method2(){
        System.out.println("3 - call from start method2");
        System.out.println("4 - call from body method2");
        System.out.println("5 - call from end method2");
    }
}
