package com.telran.prof.lessoons.lesson30.producerconsumer;

import java.util.Queue;

public class Postman implements Runnable {

    private final Queue<Message> queue;

    public Postman(Queue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int counter = 1000;
        long start = System.currentTimeMillis();
        while (counter > 0) {
            synchronized (queue) {
                if (queue.size() <= 10) {
                    Message message = new Message();
                    queue.add(message);
                    counter--;
                    System.out.println("Put message");
                    queue.notifyAll();
                } else {
                    System.err.println("Queue is FULL!!!");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            sleep(1);
        }
        long end = System.currentTimeMillis();
        System.out.println("It takes " + (end - start));
    }

    private void sleep(long mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
