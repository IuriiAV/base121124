package com.telran.prof.lessontwentyeight.stopflag;


import java.util.Scanner;

public class StopApp {

    public static boolean isEnable = true;

    public static void main(String[] args) {
        Thread thread = new Thread(new MusicPlayerAdvanced());
        thread.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name : ");
        String name = scanner.next();

        System.out.println("Input surname : ");
        String surname = scanner.next();

        System.out.println("Name Surname " + name + " " + surname);
        isEnable = false;
    }
}
