package com.telran.prof.lessoons.hw.hw15.taskthree;

import java.util.LinkedList;
import java.util.Queue;

public class MessageApp {

    public static void main(String[] args) {
        Queue<Message> messages = new LinkedList<>();

        Postman postman = new Postman(messages);
        Subscriber subscriber = new Subscriber(messages);

        new Thread(postman).start();
        new Thread(postman).start();
        new Thread(postman).start();

        new Thread(subscriber).start();
        new Thread(subscriber).start();
        new Thread(subscriber).start();
        new Thread(subscriber).start();
        new Thread(subscriber).start();

    }
}
