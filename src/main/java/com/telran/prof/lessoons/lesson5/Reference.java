package com.telran.prof.lessoons.lesson5;

/**
 * В Джаве примитивы передаютмя по знасению, для ссылочного типа -
 * копия ссылки на объект
 */

public class Reference {
     /*
    HEAP: references  #FFEE00

    ---------------------
    STACK(LIFO - last input, first output): примитивные и методы
    |            |
    |            |
    |            |
    |            |
    |            |
    |main: int a = 10; int[] ints = #FFEE00|

     */

    public static void main(String[] args) {
        int a = 10;
        int[] ints = {1,2,3};
        modifyArray(ints); //modifyArray(#FFEE00)
    }

    public static void modifyArray(int[] ints) {
        //int[] ints = #FFEE00
        ints[0] = 5;
    }
}
