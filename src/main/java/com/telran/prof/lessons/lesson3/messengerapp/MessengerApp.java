package com.telran.prof.lessons.lesson3.messengerapp;

import java.util.Scanner;

public class MessengerApp {

    public static void main(String[] args) {
        System.out.println("1-WA, 2-TG, 3-VB, 4-ICQ");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        switch (data) {
            case 1 -> send(new WhatsApp(), "Hello");
            case 2 -> send(new Telegram(), "Send via TG");
            case 3 -> send(new Viber(), "Send via VB");
            case 4 -> send(new ICQ(), "Send via ICQ");
        }
    }

    private static void send(Messenger messenger, String message) {
        messenger.sendMessage(message);
    }

//    private static void sendViaWA(WA messenger, String message) {
//        messenger.sendMessage(message);
//    }
//
//    private static void sendViaTG(TG messenger, String message) {
//        messenger.sendMessage(message);
//    }
//
//    private static void sendViaVB(VB messenger, String message) {
//        messenger.sendMessage(message);
//    }
//
//    private static void sendViaICQ(ICQ messenger, String message) {
//        messenger.sendMessage(message);
//    }
}
