package com.telran.prof.lessons.lesson5;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        int[] one = {1, 2, 3};

        /*
        {1,2,3, 7}
        {4,5,6, 8}
        {7,8,9, 0}
        {{1 2 3 7},{4 5 6 8},{7 8 9 0}}
         */

        int[][] two = new int[3][4];
        int[][] three = {{1, 2, 3, 7}, {4, 5, 6, 8}, {7, 8, 9, 0}};
        System.out.println(three[0][0]);
        System.out.println(three[1][2]);

        for (int i = 0; i < three.length; i++) {
            for (int j = 0; j < three[i].length; j++) {
                System.out.print(three[i][j] + " ");
            }
            System.out.println();
        }

        int[][][] arr = {{{}, {}}, {{}, {}}};

        System.out.println();
        int[][] five = new int[3][];

        int[][] four = {{1, 2, 3, 7}, {4, 5}, {7, 8, 9, 0, 9}};
        for (int i = 0; i < four.length; i++) {
            for (int j = 0; j < four[i].length; j++) {
                System.out.print(four[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(four));

        int[][][][][] six = new int[2][][][][];
    }
}
