package com.telran.prof.lessons.lessons3.messengerapp;

import java.util.Scanner;

public class MessengerApp {

    public static void main(String[] args) {
        System.out.println("1-WA, 2-TG, 3-VB, 4-ICQ");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        switch (data) {
            case 1 -> send(new WhatsApp(), "Hello");
            case 2 -> send(new Telegram(), "Heeello");
            case 3 -> send(new Viber(), "Hellllo");
            case 4 -> send(new Isq(), "Hellooo");
        }
    }

    private static void send(Messenger messenger, String message) {
        messenger.sendMessage(message);
    }
}
