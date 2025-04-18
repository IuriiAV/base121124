package com.telran.prof.lessontwentyeight.interrupt;

import java.util.ArrayList;
import java.util.List;

public class ThreadExampleThree implements Runnable {

    private List<Integer> list = new ArrayList<>();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Interrupt command when sleep");
                //boolean interrupted = Thread.interrupted();

            }

            for (int i = 0; i < 100_000; i++) {
                list.add(i);
                list.contains(i/4);
            }
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Interrupt command when work");

            }
        }
    }
}
