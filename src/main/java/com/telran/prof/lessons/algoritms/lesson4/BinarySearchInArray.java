package com.telran.prof.lessons.algoritms.lesson4;

public class BinarySearchInArray {

    public static void main(String[] args) {
//        int[] array = {11, 22, 44, 50, 60, 86, 114, 140, 145, 190};
        int[] array = {-190, -145, -140, -114, -86, -60, -50, -44, -22, -11};
        int x = (123);
        System.out.println("Наш искомый элемент '" + x + "' находится по индексу: " +
                binarySearchElementIteration(array, x));

        //System.out.println("Наш искомый элемент '" + x + "' находится по индексу: "
        //        + searchElement(array, x));
    }

    public static int binarySearchElementIteration(int[] array, int x) {
        //определяем левый и правый индексы
        int left = 0;
        int right = array.length - 1;
        //запускаем цикл, пока индексы не встретятся или не найдем элемент
        while (left <= right) {
            //находим индекс серединного элемента
            int middle = left + (right - left) / 2; // or -> right + left / 2
            int element = array[middle]; //array[4] = 60
            if (element == x) //60 != 114
                return middle;
            if (element < x) {
                // значит нужно искать в правой части от середины
                left = middle + 1; // left = 5;
            } else {
                //значит нужно искать в левой части от середины
                right = middle - 1;
            }
        }
        return -1;
    }

    public static int searchElement(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x)
                x = i;
        }
        return x;
    }
}
