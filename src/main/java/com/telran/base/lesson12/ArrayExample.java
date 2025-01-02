package com.telran.base.lesson12;

public class ArrayExample {

    public static void main(String[] args) {
        int[] ints = {1,4,5,6,3,2,52,3,2,34};
        ArrayExample arrayExample = new ArrayExample();
        System.out.println(arrayExample.getMax(ints));
    }

    public int getMax(int[] ints) {
        if (ints == null || ints.length == 0) {
            return -1;
        }

        int max = ints[0];
        for (int i = 1; i < ints.length; i++) {
            max = Math.max(max, ints[i]);
        }
        return max;
    }
}
