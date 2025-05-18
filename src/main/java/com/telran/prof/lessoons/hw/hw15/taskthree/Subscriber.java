package com.telran.prof.lessoons.hw.hw15.taskthree;

import java.util.Queue;

public class Subscriber implements Runnable {

    private final Queue<Message> queue;

    public Subscriber(Queue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {

            synchronized (queue) {
                if (!queue.isEmpty()) {
                    queue.poll();
                    System.out.println("Get message");
                    queue.notifyAll();
                } else {
                    System.err.println("Queue is EMPTY!");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            pause(10);
        }
    }

    private void pause(long mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
