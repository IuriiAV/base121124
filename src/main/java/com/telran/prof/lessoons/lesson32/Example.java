package com.telran.prof.lessoons.lesson32;

import java.time.LocalDateTime;

public class Example {
    //volatile - не нужно кешировать данную переменную
    //public static volatile boolean flag = true;

    public static long start;

    public static void main(String[] args) throws Exception {
        Printer printer = new Printer();

        for (int i = 0; i < 4; i++) {
            new Thread(printer).start();
        }

//        new Thread(printer).start();
//        new Thread(printer).start();
//        new Thread(printer).start();
//        new Thread(printer).start();
//        new Thread(printer).start();
//
//        Thread thread = new Thread(printer);
//        thread.start();
//
//        new Thread(printer).start();

        Thread.sleep(10);

        LocalDateTime time = LocalDateTime.now();
        start = System.currentTimeMillis();
        printer.result = 100;

        //printer.flag = false;

        System.out.println("Flag time " + Thread.currentThread().getName() + " " + time);
       // thread.interrupt();
    }
}
