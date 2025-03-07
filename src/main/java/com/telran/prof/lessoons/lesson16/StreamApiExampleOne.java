package com.telran.prof.lessoons.lesson16;

import java.util.Arrays;
import java.util.List;

public class StreamApiExampleOne {

    public static void main(String[] args) {
        //Stream API - инструмент для работы с потоком данных
        //OutputStream, InputStream - потоки ввода вывода
        //Thread - потоки выполнения программы(многопоточность)

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 56, 78, 9, 87, 65, 4, 32, 1);
        for (Integer value : list) {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        }

        System.out.println();

        //1->....3-> 2-> 1->
        list.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(integer -> System.out.print(integer + " "));
    }
}
