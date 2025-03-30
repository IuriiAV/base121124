package com.telran.prof.lessons.lesson20.homework.taskone;

import java.util.Scanner;

public class UserApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            User user = new User("Alex", 20);
            User user1 = new User("Max", 9);
            System.out.println(user1);
            System.out.println(user);
        } catch (InvalidAgeException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
