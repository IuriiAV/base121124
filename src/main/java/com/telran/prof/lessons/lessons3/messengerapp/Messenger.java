package com.telran.prof.lessons.lessons3.messengerapp;

public abstract class Messenger {

    public void sendMessage(String message) {
        System.out.println("Send message " + message);
    }

    public abstract void receiveMessage();
}
