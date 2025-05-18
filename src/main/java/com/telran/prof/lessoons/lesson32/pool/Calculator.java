package com.telran.prof.lessoons.lesson32.pool;

import lombok.SneakyThrows;

import java.time.LocalDateTime;

public class Calculator implements Runnable {

    private final int count;

    public Calculator(int count) {
        this.count = count;
    }

    @SneakyThrows
    @Override
    public void run() {
        System.out.println("Start thread " + Thread.currentThread().getName() + " " + count + " " + LocalDateTime.now());
        Thread.sleep(1);
        System.out.println("Stop thread " + Thread.currentThread().getName() + " " + count);
    }
}
