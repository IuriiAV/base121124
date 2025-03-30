package com.telran.prof.lessonfive;

import java.util.Arrays;

/**
 * Одномерный массив - массив из набора элементов
 * Многомерный массив - массив, элементами которого, являются другие массивы
 * Массив массивов!!!!
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] one = {1, 2, 3};  // 1 2 3

        /*     3*3 ; 1 = 0, 0 , 2 = 0, 1, 3 = 0,2 , 4 = 1,0 , 5 = 1, 1
        {1 2 3 7}
        {4 5 6 8}
        {7 8 9 0}

        {{1 2 3 7},{4 5 6 8},{7 8 9 0}}
         */
        int[][] two = new int[3][4];

        int[][] three = {{1, 2, 3, 7}, {4, 5, 6, 8}, {7, 8, 9, 0}};
        System.out.println(three[0][0]); // 1
        System.out.println(three[1][2]); //6

        for (int i = 0; i < three.length; i++) {
            for (int j = 0; j < three[i].length; j++) {
                System.out.print(three[i][j] + " ");
            }
            System.out.println();
        }

        int[][][] arr = {{{}, {}}, {{}, {}}};
        //{{}, {}} // {} // 5

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
