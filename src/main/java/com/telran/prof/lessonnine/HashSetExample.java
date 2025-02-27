package com.telran.prof.lessonnine;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet - набор уникальных елементов без какого либо порядка
 * (*мешок уныкальных елементов*) - на совбесе не говорить мешок
 *
 * add, remove, contains - 0(1)
 * (в случаи корректной реализации хешкода)
 *
 * Внутри HS -> HM -> массив из 16 елементов
 * ячейки этого массива называються бакетами
 *
 * что происходит когда вызываем метод add для добавления елемента
 * 1) у добавляемого елемента вызываеться метод hashCode
 * 2) Используя полученные значенния и длину внутренного массива нашего HS
 * мы вычислеям нужную ячейку массива (индекс) в которую должны поместить элемент
 * 3) Если вычысленноя ячецка пустаю то там создаеться связный список и наш елемент
 * становиться головой нашего связного списка
 *
 * Таким образом внутри HS-> массив связных списков
 *
 * В идеальном мире при рализации хешкода объекта
 * HS -> всегда заполненн на 75% максимум  , и в каждой ячейке лежит только
 * по одному , элементу в голове связзного списка
 */
public class HashSetExample {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("a");
        stringSet.add("c");
        stringSet.add("f");
        stringSet.add("d");
        stringSet.add("a");

        System.out.println(stringSet);

        System.out.println("Get contains f : " + stringSet.contains("f"));

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(5);
        setInteger.add(3);
        setInteger.add(1);
        setInteger.add(66);

        System.out.println(setInteger);
        setInteger.remove(1);
    }
}
