package com.telran.prof.lessoons.lesson20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * В Java есть проблемные ситуации когда программа может свалиться во время работы
 * эти ситуации называются исключениями(не ошибками)
 * 
 * И исключения данного вида происходят во время выполнения приложения и мы можем
 * не подозревать, что они могут быть
 * Поправить эти ошибки можно дополнительными проверками в коде
 *
 * Исключения другого вида сразу заметны в момент написания кода, об этом нам скажет
 * компилятор или редактор кода, нам будет указано на потенциальное место, где
 * может быть проблема
 * Такие проблемы правятся блоком try-catch или пробросом исключения выше
 *
 * Исключения это объекты определенных классов
 *
 *             Throwable
 * Error                   Exception
 *
 * Error - это ошибки уровня виртуальной машины JVM (мы их не обрабатываем)
 * StackOverFlowError, OutOfMemoryError
 *
 * Exception : -> Classes -> checked -> проверяемые исключения
 * Данные исключения мы обязаны обработать либо блоком try-catch, либо пробросить выше
 * по стеку вызовов(в метод который вызвал метод где оно может быть), где оно тоже будет
 * обработано try-catch, хочешь не хочешь, а обработать прийдется, иначе программа
 * не с компилируется
 *
 * Exception : -> RuntimeException -> Classes -> unchecked -> не проверяемые исключения
 * Данные исключения не обязательно обрабатывать, но во время работы программы может быть
 * неприятность)) и об этом нам никто не скажет и программа запуститься
 * Данные исключения можно предотвратить кодом и этот вид тоже можно пробросить выше или
 * обработать try-catch
 */

public class ExceptionExampleCommon {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        divide(a, b);

        printStringLength(null);
    }

    private static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero");
            return;
        }
        int division = a / b;
        System.out.println(division);
    }

    private static void printStringLength(String str) {
        if (str == null) {
            System.out.println("String is null");
            return;
        }
        System.out.println(str.length());
    }
    
    private static void readStringFromFile(String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
