package com.telran.prof.lessons.algoritms.lesson4;

public class BinarySearchArrayRecursion {

    public static void main(String[] args) {
        int[] array = {11, 22, 44, 50, 60, 86, 114, 140, 145, 190};
        int x = 114;
        System.out.println(recursionBinarySearch(array, 0, array.length - 1, 114));
    }

    public static int recursionBinarySearch(int[] array, int left, int right, int x) {
        int middle = left + (right - left) / 2;
        int element = array[middle];

        if (element == x)
            return middle;

        if (left > right)
            return -1;

        if (element < x) {
            return recursionBinarySearch(array, middle + 1, right, x);
        } else {
            return recursionBinarySearch(array, left, middle - 1, x);
        }
    }
}
