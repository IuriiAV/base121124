package com.telran.prof.lessonthirty.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class MessageApp {

    public static void main(String[] args) {
        Queue<Message> queue = new LinkedList<>(); //add() -add to end, poll() - get from front
        Postman postman = new Postman(queue);
        Subscriber subscriber = new Subscriber(queue);

        new Thread(postman).start();

        new Thread(subscriber).start();
//        new Thread(subscriber).start();
//        new Thread(subscriber).start();
//        new Thread(subscriber).start();
//        new Thread(subscriber).start();
    }
}
