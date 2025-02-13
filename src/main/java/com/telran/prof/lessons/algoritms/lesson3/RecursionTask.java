package com.telran.prof.lessons.algoritms.lesson3;

public class RecursionTask {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumIteration(n));
        System.out.println(sumRecursion(n));
    }

    public static int sumIteration(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + (sumRecursion(n - 1));
        return sum;
    }
}
