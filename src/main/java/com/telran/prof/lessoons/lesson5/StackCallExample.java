package com.telran.prof.lessoons.lesson5;

public class StackCallExample {

        /*

    ---------------------
    STACK(LIFO - last input, first output): примитивные и методы
    |            |
    |            |
    |            |
    |            |
    |            |
    |            |

     */

    public static void main(String[] args) {
        System.out.println("1 - call from method main");
        method1();
        System.out.println("7 - end from method main");
    }

    public static void method1() {
        System.out.println("2 - call from start method 1");
        method2();
        System.out.println("6 - call from start method 1");
    }

    public static void method2() {
        System.out.println("3 - call from start method 2");
        System.out.println("4 - call from body method 2");
        System.out.println("5 - end from method method 2");
    }
}
