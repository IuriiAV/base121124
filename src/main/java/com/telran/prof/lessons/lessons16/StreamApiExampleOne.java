package com.telran.prof.lessons.lessons16;

import java.util.Arrays;
import java.util.List;

public class StreamApiExampleOne {

    public static void main(String[] args) {
        // Stream API - инструмент для работы с потоком данных
        // OutputStream, InputStream - потоки ввода и вывода
        // Thread - потоки выполнения программы(многопоточность)

        List<Integer> list = Arrays.asList(1, 4, 5, 6, 4, 3, 5, 7, 8, 9, 2, 5, 6, 2, 3);
        for (Integer value : list){
            if (value % 2 == 0){
                System.out.print(value + " ");
            }
        }

        System.out.println();

        //3->...5->4->1->
        list.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(integer -> System.out.print(integer + " "));
    }
}
