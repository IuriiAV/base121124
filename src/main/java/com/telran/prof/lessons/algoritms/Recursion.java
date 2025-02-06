package com.telran.prof.lessons.algoritms;

public class Recursion {

    public static void main(String[] args) {
        //print digits from 1 to 5
        System.out.println("Iterate approach:");
        int x = 5;
        for (int i = 1; i <= x; i++)
            System.out.print(i + " ");

        System.out.println("\nRecurrent approach:");
        printDigit(1);
    }

    public static void printDigit(int x) { // 1
        //base case
        if (x == 6)
            return;

        //recurrent case
        System.out.print(x + " ");
        printDigit(x + 1);
    }
}
