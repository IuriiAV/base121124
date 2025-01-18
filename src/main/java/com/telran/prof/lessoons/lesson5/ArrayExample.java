package com.telran.prof.lessoons.lesson5;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        int[] one = {1,2,3};

        int[][] two = new int[3][3];

        int[][] three = {{1,2,34,5},{2,34,6,8,7,54,3},{4,5,6,78,98,76,543},{4,3,25,6,32}};
        System.out.println(three[0][0]);
        System.out.println(three[1][2]);

        for (int i = 0; i < three.length; i++) {
            int[] ints = three[i];
            for (int j = 0; j < ints.length; j++) {
                System.out.print(three[i][j] + " ");
            }
            System.out.println();
        }

        int[][][] arr = {{ {} , {} } , { {} , {} }};
        System.out.println();
        int[][] four = {{1,2,34,5},{2,34,6,8,7,54,3},{4,3,25,6,32}};
        for (int i = 0; i < four.length; i++) {
            int[] ints = four[i];
            for (int j = 0; j < ints.length; j++) {
                System.out.print(four[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(four));
    }
}
