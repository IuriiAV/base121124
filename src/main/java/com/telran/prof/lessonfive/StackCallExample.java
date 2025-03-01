package com.telran.prof.lessonfive;

public class StackCallExample {

    /*
    -------------------------------------
    STACK(LIFO - last input, first output):

    |                      |
    |                      |
    |method2 : 3, 4, 5     |
    |method1 :2, method2,6 |
    |main:_1, method1,7__  |<-
    ___________________
     */

    public static void main(String[] args) {
        System.out.println("1 - call from start method main");
        method1();
        System.out.println("7 - end from method main");
    }

    public static void method1() {
        System.out.println("2 - call from start method1");
        method2();
        System.out.println("6 - call from end method1");
    }

    public static void method2() {
        System.out.println("3 - call from start method2");
        System.out.println("4 - call from body method2");
        System.out.println("5 - call from end method2");
    }
}
