package com.telran.prof.lessonfive;

import java.util.Arrays;

/**
 * В Java, все передается по значению, для примитива передается значение примитива
 * для ссылочного типа - передается копия значения ссылки на объект
 */
public class ReferenceExample {

    /*
    HEAP : references   #FFEE00 : { 5, 2, 3}

    -------------------------------------
    STACK(LIFO - last input, first output):

    |        |
    |        |
    |        |
    |modifyArray : int[] array = #FFEE00 ; array[0] = 5     |
    |main : int a = 10; int[] array = #FFEE00|

     */

    public static void main(String[] args) {
        int a = 10;  // primitive // 10
        int[] array = {1, 2, 3}; //reference // #FFEE00
        modifyArray(array); // #FFEE00 modifyArray(#FFEE00)
        System.out.println(Arrays.toString(array));
    }

    public static void modifyArray(int[] array) {
        //int[] array = #FFEE00
        array[0] = 5; //#FFEE00
    }
}
