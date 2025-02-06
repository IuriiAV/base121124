package com.telran.prof.lessons.lesson9;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet -набор уникальных элементов, без какого-либо порядка
 * ("мешок уникальных элементов")
 * <p>
 * add, remove, contains - O(1)
 * (в случае корректной реализации хэш-кода)
 * <p>
 * HashSet -> HashMap -> Хэш-таблица
 * -> это значит, что во всех манипуляциях с данной коллекцией, участвует хэш-код объекта
 * <p>
 * У каждого объекта в Ждава можно вычислить hashcode
 * он вычисляется с помощью метода hashcode из класса Object
 * Хэш-код это целое число типа int
 * <p>
 * Внутри HS -> HM -> массив из 16 элементов
 * ячейки этого массива называются бакетами
 * <p>
 * Что происходит, когда мы вызываем метод .add для добавления элемента:
 * 1) У добавленного элемента вызывается метод hashCode
 * 2) Используя полученное значение и длину внутреннего массива нашего HS
 * мы вычисляем нужную ячейку массива (индекс), в которую должны поместить элемент
 * 3) Если вычисленная ячейка пустая, то там создается связный список и наш элемент становится
 * головой нашего связного списка
 * <p>
 * Таким образом внутри HS -> массив связных списков
 * <p>
 * В идеальном мире, при правильной реализации хэш-кода объекта,
 * HS -> всегда заполнен на 75% максимум и в каждой ячейке лежит
 * только по одному элементу в голове связного списка
 * <p>
 * Но иногда бывает так, что у двух разных объектов - одинаковый хэш-код и
 * эти попадают в одну корзину (индекс основан на хеш-коде и длине массива)
 * // (Alex) 555 - 10 hash -> index 4 -> head LL(Alex)
 * // (Oleg) 555 - 10 hash -> index 4 -> head LL(Oleg) -> (Alex) O(n)
 * В такой ситуации будут перебраны все элементы связного списка и они будут
 * сравниваться через метод equals с тем объектом, с которым мы туда пытаемся поместить
 * и если совпадений не найдется-то это не дубль, то новый объект вставится в голову LL
 * <p>
 * Что происходит, когда ищем элемент через contains:
 * 1) У искомого элемента вызывается метод hashCode O(1)
 * 2) Хеш-код элемента передаем в функцию hash, которая возвращает некое число и используя полученное
 * значение и длину внутреннего массива нашего HS мы вычисляем нужную ячейку массива (индекс),
 * где должен находится тот элемент, который мы ищем
 * 3) Если вычисленная ячейка пустая, то вернем false, если там есть связный список с одним элементом
 * в голове, то сравним его с тем, который ищем через equals и если они одинаковые, то вернем true
 * Если в связном списке больше чем 1 элемент, то будем перебирать все и сравнивать и если найдем,
 * то вернем true иначе false
 * <p>
 * 1) У двух одинаковых объектов - всегда одинаковый хеш-код
 * 2) У одного объекта хеш-код всегда постоянен
 * Хеш-код - это быстрый способ сравнения объектов:
 * 1) Если у двух объектов хеш-коды разные, то объекты точно разные!!!
 * 2) Если у двух объектов хеш-коды одинаковые, то тогда нужно сравнить
 * эти объекты через equals, так как это могут быть разные объекты, а хеш-код будет коллизией
 * <p>
 * Изначально элементов 16, когда мы достигаем заполнения 75%, то внутренний массив
 * увеличивается в 2 раза до 32 и так как позиция элемента (индекс ячейки где он хранится),
 * зависит от хеш-кода и длины массива, топри изменении размера, для всех элементов,
 * что хранятся в нашем сете будут пересчитаны индексы ячеек, те они переместятся в новые ячейки
 */
public class HashSetExample {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("A");
        stringSet.add("C");
        stringSet.add("E");
        stringSet.add("F");
        stringSet.add("D");
        stringSet.add("a");
        System.out.println(stringSet);
        System.out.println("Set contains F " + stringSet.contains("F"));

        Set<Integer> integers = new HashSet<>();
        integers.add(2);
        integers.add(4);
        integers.add(1);
        integers.add(7);
        integers.add(3);
        integers.remove(3);

        System.out.println(integers);
    }
}
