package com.telran.prof.lessoons.lesson3.messanger;

public abstract class Messanger {

    public static void sendMessage(String message) {
        System.out.println("Send message " + message);
    }

    public abstract void recieveMessage();
}
