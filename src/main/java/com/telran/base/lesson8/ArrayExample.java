package com.telran.base.lesson8;

/**
 * Массив это набор элементов, одинакового типа, расположенных в памяти друг за другом
 * (последовательно)
 * Syntax:
 * <type>[] <name> = new <type>[size]
 * <p>
 * size - int type!!!
 * <p>
 * int[] array = new int[10]; В оперативной памяти будет создан массив и 10 ячеек,
 * в каждую из которых можно поместить целое число
 * <p>
 * По умолчанию, для целых чисел при создании внутри ячеек 0,
 * для дробных 0.0, для логических false, для ссылочных типов - null
 *
 *  int[] arrayOne = {5, 6, 3, 6, 7, 4, 3, 5, 6, 7, 8, 3, 1}; - быстрое создание
 *  массива
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] array = new int[4];//объявление переменной и выделение места под массив

        int[] ints; // объявление переменной массива
        ints = new int[5]; // выделение места под массив в оперативной памяти

        //   0   1   2   3
        // | 0 | 0 | 0 | 0 |

        array[0] = 5; // поместили 5 в ячейку с индексом 0
        //   0   1   2   3
        // | 5 | 0 | 0 | 0 |

        array[3] = 7;
        //   0   1   2   3
        // | 5 | 0 | 0 | 7 |

        int temp = array[0]; // прочитали элемент из ячейки с индексом 0
        // и поместили его в переменную temp
        System.out.println("Element from 0 cell is = " + temp);

        //System.out.println(array[-1]);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);

        for (int i = 0; i <= 3; i++) {
            System.out.println("i = " + i + " array = " + array[i]);
        }

        System.out.println("Array length is " + array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println("i = " + i + " array = " + array[i]);
        }

        int[] arrayOne = {5, 6, 3, 6, 7, 4, 3, 5, 6, 7, 8, 3, 1};
        System.out.println("Length of arrayOne = " + arrayOne.length);

        for(int i = 0;  i < arrayOne.length; i++) {
            System.out.print(arrayOne[i] + " ");
        }
    }
}
