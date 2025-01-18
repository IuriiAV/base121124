package com.telran.prof.lessoons.lesson3.messanger;

import java.util.Scanner;

public class MessangerApp {

    public static void main(String[] args) {
        System.out.println("1 - WA, 2 - TG, 3 - VB, 4 - ICQ");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        switch (data) {
            case 1 -> sendMessage(new WhatsApp(), "Hello");
            case 2 -> sendMessage(new Telegram(), "Hi");
            case 3 -> sendMessage(new Viber(), "Hi bro");
            case 4 -> sendMessage(new Icq(), "Hello!");
        }
    }

    private static void sendMessage(Messanger messanger, String message) {
        messanger.sendMessage(message);
    }
}
