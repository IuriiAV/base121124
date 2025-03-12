package com.telran.prof.lessonfive;

public class DeleteExample {

     /*
    HEAP : references   #HHAAFF : { 1, 2, 3}

    -------------------------------------
    STACK(LIFO - last input, first output):

    |        |
    |        |
    |        |
                                       |generateArray :  int[] array = #HHAAFF        |
    |main : generateArray;_Hello____   | <-

     */

    public static void main(String[] args) {
        generateArray();
        System.out.println("Hello");
    }

    public static void generateArray() {
        int[] array = {1,2,3};
    }
}
