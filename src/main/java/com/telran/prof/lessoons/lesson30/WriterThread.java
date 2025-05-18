package com.telran.prof.lessoons.lesson30;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

public class WriterThread implements Runnable {

    private final List<Integer> list;

    public WriterThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        Random random = new Random();
        System.out.println("Writer " + Thread.currentThread().getName() + " start " + LocalDateTime.now());
        int size = random.nextInt(100, 500);
        System.out.println("Writer " + Thread.currentThread().getName() + " write " + size + " elements " + LocalDateTime.now());
        int sum = 0;
        for (int i = 0; i < size; i++) {

            synchronized (list) {
                int value = random.nextInt(100);
                sum += value;
                list.add(value);
                System.out.println("Writer write value " + value + " " + LocalDateTime.now());
            }
            sleep(random.nextLong(100));
        }

        synchronized (list) {
            //list.notify(); // пробуждает поток, который находится в ожидании на мониторе объекта
        }
        System.out.println("Writer " + Thread.currentThread().getName() + " sum " + sum + " end " + LocalDateTime.now());
    }

    private void sleep(long mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
