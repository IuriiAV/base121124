package com.telran.base.lesson9;

import java.util.Arrays;
import java.util.Random;

/**
 * 35, 6, 4, 5, 8, 1 , 50
 * 6, 35, 4, 5, 8, 1 , 50
 * 6, 4, 35, 5, 8, 1 , 50
 * 6, 4, 5, 35, 8, 1 , 50
 * 6, 4, 5, 8, 35, 1 , 50
 * 6, 4, 5, 8, 1, 35 , 50
 * 6, 4, 5, 8, 1, 35 , 50
 * <p>
 * 6, 4, 5, 8, 1, 35 , 50
 * 4, 6, 5, 8, 1, 35 , 50
 * 4, 5, 6, 8, 1, 35 , 50
 * 4, 5, 6, 1, 8, 35 , 50
 * 4, 5, 6, 1, 8, 35 , 50
 * 4, 5, 6, 1, 8, 35 , 50
 * <p>
 * 4, 5, 6, 1, 8, 35 , 50
 * 4, 5, 6, 1, 8, 35 , 50
 * 4, 5, 1, 6, 8, 35 , 50
 * 4, 5, 1, 6, 8, 35 , 50
 * 4, 5, 1, 6, 8, 35 , 50
 * 4, 5, 1, 6, 8, 35 , 50
 * <p>
 * 4, 5, 1, 6, 8, 35 , 50
 * 4, 1, 5, 6, 8, 35 , 50
 * 4, 1, 5, 6, 8, 35 , 50
 * 4, 1, 5, 6, 8, 35 , 50
 * 4, 1, 5, 6, 8, 35 , 50
 * 4, 1, 5, 6, 8, 35 , 50
 * <p>
 * 1, 4, 5, 6, 8, 35 , 50
 * 1, 4, 5, 6, 8, 35 , 50
 * 1, 4, 5, 6, 8, 35 , 50
 * 1, 4, 5, 6, 8, 35 , 50
 * 1, 4, 5, 6, 8, 35 , 50
 * 1, 4, 5, 6, 8, 35 , 50
 *
 * Time complexity O(n^2) - n количество элементов в массиве
 */
public class BubbleSortExample {

    public static void main(String[] args) {
        //int[] array = {35, 6, 4, 5, 8, 1, 50};
        //int[] array = {35,22,11,9,8,7,3,6,7,8,5,7,7,8,5,6,7,3,4,5,6,7,4,3,5,6,7,45,6,45,6,3,4,34,342};


        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,150);
        }
        System.out.println(Arrays.toString(array));

        int counter = 0;

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                //int elementBefore = array[i]; // 35 // 6 // 4 // 5 //8 // 1 // 50
                //int elementAfter = array[i + 1]; // 6 //4 // 5 // 8 //1 //50 // Index of Bound
                if (array[i] >= array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
                counter++;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("It takes " + counter + " iterations");
    }
}
