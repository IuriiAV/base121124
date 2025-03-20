package com.telran.prof.lessontwentyone;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * InputStream - класс для чтения потока байт
 * OutputStream - класс для записи потока байт
 * Reader - класс для чтения потока символов
 * Writer - класс для записи потока символов
 */
public class IOStreamExample {

    public static void main(String[] args) {
        //1.System.out
        PrintStream out = System.out;
        //%s, %d, %f
        System.out.printf("Hello %s with age %d", "Max", 45);
        System.out.println();
        System.out.printf(Locale.CHINA,"Date is %tA %tB %tY", new Date(), new Date(), new Date());

        //2.System.err
        System.err.println("Hello");
        System.out.println();

        //3.System.in
        InputStream in = System.in;
        Scanner scanner = new Scanner("Hi Hi");
        String next = scanner.nextLine();
        System.out.println("" + next);

    }
}
