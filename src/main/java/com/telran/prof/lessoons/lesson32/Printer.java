package com.telran.prof.lessoons.lesson32;

import lombok.SneakyThrows;

import java.time.LocalDateTime;


public class Printer implements Runnable {

    public volatile boolean flag = true;

    public volatile int result = 0;

    @SneakyThrows
    @Override
    public void run() {
        //int resultLocal = 0;
        //true
        //компилятор мог заменить условие цикла сразу на тру
        //так как флаг изначально стоит тру
        while (flag) {
            if(result == 100) {
                break;
            }
            Thread.sleep(1);
        }
        //System.out.println(result);
        //LocalDateTime time = LocalDateTime.now();
        long time = System.currentTimeMillis();
        System.out.println("Stop time " + " " + (time - Example.start));
    }
}
