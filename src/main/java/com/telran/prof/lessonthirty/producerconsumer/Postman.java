package com.telran.prof.lessonthirty.producerconsumer;

import java.util.Queue;

public class Postman implements Runnable {

    private final Queue<Message> queue;

    public Postman(Queue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int count = 1000;
        // каждые 100 мсек добавляет сообщение в очередь
        // до того момента пока очередь не станет размером 100
        long start = System.currentTimeMillis();
        while (count > 0) {
            synchronized (queue) {
                if (queue.size() <= 10) {
                    Message message = new Message();
                    queue.add(message);
                    count--;
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

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("It takes " + (end - start));
    }
}
