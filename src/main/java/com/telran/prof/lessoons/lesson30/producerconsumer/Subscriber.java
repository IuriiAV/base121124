package com.telran.prof.lessoons.lesson30.producerconsumer;

import java.util.Queue;

public class Subscriber implements Runnable {

    private final Queue<Message> queue;

    public Subscriber(Queue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            sleep(10);
            synchronized (queue) {
                if (!queue.isEmpty()) {
                    queue.poll();
                    //System.out.println(Thread.currentThread().getName() + " Get message");
                    queue.notifyAll();
                } else {
                    System.err.println("Queue is EMPTY!!!");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private void sleep(long mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
