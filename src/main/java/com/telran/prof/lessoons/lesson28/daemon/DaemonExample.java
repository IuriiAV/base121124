package com.telran.prof.lessoons.lesson28.daemon;

import java.util.Scanner;

/**
 * Поток daemon - поток, которого не будет ждать поток, который его создал
 * те если создатель закончил свою работу, а дочерний поток еще нет, то дочерний
 * принудительно будет завершен
 */

public class DaemonExample {

    public static void main(String[] args) {

        Thread thread = new Thread(new MusicPlayer());
        thread.setDaemon(true);
        thread.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name :");
        String name = scanner.next();
        System.out.println("Input surname :");
        String surname = scanner.next();

        System.out.println("Name Surname : " + name + " " + surname);
    }
}
