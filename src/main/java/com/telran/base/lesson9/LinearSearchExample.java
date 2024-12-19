package com.telran.base.lesson9;

/**
 * Линейный поиск - поиск элемента внутри массива
 * Это простой перебор всех элементов массива и сравнение каждого
 * элемента с искомым
 */
public class LinearSearchExample {

    public static void main(String[] args) {
        int[] array = {3, 4, 3, 5, 6, 8, 1, 0, 22, 35, 70, 7, 9};
        int target = 35;

        boolean isFound = linearSearch(array, target);
        System.out.println("Is element " + target + " found in array ? " + isFound);

        target = 50;
        isFound = linearSearch(array, target);
        System.out.println("Is element " + target + " found in array ? " + isFound);

        isFound = linearSearch(array, 35);
        if (isFound) {
            System.out.println("Hello");
        }
    }

    private static boolean linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }

        return false;
    }
}
