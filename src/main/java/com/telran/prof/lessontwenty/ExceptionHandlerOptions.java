package com.telran.prof.lessontwenty;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * В Java можно перехватить любое исключение, не зависит от того проверяемое или нет
 * <p>
 * try - catch - основной метод перехвата
 * <p>
 * try {
 * <p>
 * //пишется код, в котором потенциально может быть исключение
 * } catch (тип исключения который этот блок, способен перехватить) {
 * //пишется код, в котором мы обрабатываем исключение или
 * //просто логируем
 * }
 * При перехвате исключения, программа продолжает работать!!!
 */
public class ExceptionHandlerOptions {

    public static void main(String[] args) {
        System.out.println("Run program");
        int a = 10;
        int b = 0;
        divide(a, b, "null");
        System.out.println("End program");

        readFile("null");
    }

    //Перехват несколько исключений разными блоками catch
    private static void divideOne(int a, int b, String text) {
        try {
            System.out.println(text.length());
            int division = a / b;
            System.out.println(division);
        } catch (ArithmeticException exception) {
            System.out.println("Problem with division " + exception.getMessage());
        } catch (NullPointerException exception) {
            System.out.println("Problem with string " + exception.getMessage());
        }
    }

    //Перехват в одном блоке нескольких
    private static void divide(int a, int b, String text) {
        try {
            System.out.println(text.length());
            int division = a / b;
            System.out.println(division);
        } catch (ArithmeticException | NullPointerException exception) {
            System.out.println("Problem in method " + exception.getMessage());
        }
    }

    //Перехват по иерархии
    //Exception -> IOException -> FileNotFoundException
    private static void readFileOne(String path) {
        try {
            FileReader reader = new FileReader(path);
            int read = reader.read();
            // блоки catch выполняются сверху вниз для поиска подходящего перехватчика
            // если исключение перехвачено одним из блоков, то другие не вызываются
        } catch (FileNotFoundException exception) {
            System.out.println("File not found " + exception.getMessage());
        } catch (IOException exception) { //IOException, FileNotFoundException
            System.out.println("Problem with read from file" + exception.getMessage());
        }
    }

    //Перехват по иерархии всего что летит
    //Exception -> IOException -> FileNotFoundException
    private static void readFile(String path) {
        try {
            int length = path.length();
            FileReader reader = new FileReader(path);
            int read = reader.read();
            // блоки catch выполняются сверху вниз для поиска подходящего перехватчика
            // если исключение перехвачено одним из блоков, то другие не вызываются
        } catch (Exception exception) {
            System.out.println("Problem " + exception.getMessage());
        }
//        } catch (FileNotFoundException exception) {
//            System.out.println("File not found " + exception.getMessage());
//        } catch (IOException exception) { //IOException, FileNotFoundException
//            System.out.println("Problem with read from file" + exception.getMessage());
//        } catch (Exception exception) {
//            System.out.println("Problem " + exception.getMessage());
//        }
    }
}
