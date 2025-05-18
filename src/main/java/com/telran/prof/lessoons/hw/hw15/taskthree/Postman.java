package com.telran.prof.lessoons.hw.hw15.taskthree;

import java.util.Queue;

public class Postman implements Runnable {

    private final Queue<Message> queue;

    public Postman(Queue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {

            synchronized (queue) {
                if (queue.size() <= 100) {
                    queue.add(new Message());
                    System.out.println("Put message");
                    queue.notifyAll();
                } else {
                    System.err.println("Queue is FULL!");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            pause(5);
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
