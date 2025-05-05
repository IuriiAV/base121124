package com.telran.prof.lessoons.lesson29.syncone;

import java.util.ArrayList;
import java.util.List;

/**
 * Mutex - флаг, который есть у каждого объекта(свободен или занят)
 * Данный флаг нужен для того что бы несколько потоков не работали с одним
 * и тем же объектом в один и тот же момент времени
 * <p>
 * Monitor - механизм для взаимодействия с мьютексом объекта
 * <p>
 * synchronized - команда, с помощью которой производится работа с монитором
 * объекта
 */
public class SyncApp {

    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        TestSync testSync = new TestSync();
        TestSync testSync1 = new TestSync();

//        List<Thread> users = new ArrayList<>();
//        for (int i = 0; i < 20000; i++) {
//            users.add(new Thread(testSync));
//        }

        long startTime = System.currentTimeMillis();

        Thread thread = new Thread(testSync);
        thread.start();

        Thread thread1 = new Thread(testSync);
        thread1.start();

        Thread.sleep(1000);
        System.out.println(thread.getName() + " " + thread.getState());
        System.out.println(thread1.getName() + " " + thread1.getState());

        thread.join();
        thread1.join();

//        for (Thread thread : users) {
//            thread.start();
//        }
//
//        Thread.sleep(3000);

        long endTime = System.currentTimeMillis();

        System.out.println("Counter = " + counter + " , it takes " + (endTime - startTime));
    }
}
