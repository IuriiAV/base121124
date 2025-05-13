package com.telran.prof.lessonthirty.producerconsumer;

import java.util.Queue;

public class Subscriber implements Runnable {

    private final Queue<Message> queue;

    public Subscriber(Queue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        // каждые 100 мсек извлекает сообщение из очереди
        // до того момента пока очередь не станет пустой
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (queue) {
                if (!queue.isEmpty()) {
                    Message poll = queue.poll();
                    //System.out.println(Thread.currentThread().getName() + " " + "Get message");
                    queue.notify();
                } else {
                    System.err.println("Queue is EMPTY!!!!");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
