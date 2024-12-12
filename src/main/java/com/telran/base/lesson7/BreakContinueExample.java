package com.telran.base.lesson7;

public class BreakContinueExample {

    public static void main(String[] args) {
        String test = "Hello Java Class!";
        //необходимо определить есть ли в этой строке символ J
//        System.out.println(test.charAt(0));
//        System.out.println(test.charAt(1));
//        System.out.println(test.charAt(2));
//        System.out.println(test.charAt(3));
        for (int i = 0; i < test.length(); i++) {
            char temp = test.charAt(i);
            System.out.println("Get symbol " + temp + " and check it with J");
            if ('J' == temp) {
                System.out.println("We found J in string");
                break;
            }
        }

        System.out.println();

        for (int i = 0; i < 100; i++) {
            if (i % 5 != 0) {
                continue;
            }
            System.out.println("We found correct number " + i);
        }
    }
}
