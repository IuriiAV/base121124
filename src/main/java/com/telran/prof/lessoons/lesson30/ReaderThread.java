package com.telran.prof.lessoons.lesson30;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

public class ReaderThread implements Runnable {

    private final List<Integer> list;

    public ReaderThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        System.out.println("Reader " + Thread.currentThread().getName() + " start " + LocalDateTime.now());

        synchronized (list) {
            //sleep - в синхронизированном блоке усыпит поток и все будут ждать
            //wait - в синхронизированном блоке усыпляет поток и отпускает блокировку объекта

            //sleep(10000);
            try {
                list.wait(35000); // поток будет находиться в состоянии ожидания на мониторе объекта(лока)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int sum = 0;
            for (int element : list) {
                sum += element;
            }
            System.out.println("Sum = " + sum);
        }
        System.out.println("Reader " + Thread.currentThread().getName() + " end " + LocalDateTime.now());
    }

    private void sleep(long mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
