package com.telran.prof.lessons.lesson2.Homework2;

public class PhoneApp {

    public static void main(String[] args) {
        Phone alex = new Phone("067-234-1232", "NOKIA", 153.4);
        Phone oleg = new Phone("067-672-1136", "IPhone", 132.6);
        Phone max = new Phone("023-848-2535", "Xiaomi", 143.1);

        alex.printInfo();
        oleg.printInfo();
        max.printInfo();

        alex.receiveCall("Alex");
        System.out.println("Number: " + alex.getNumber());

        oleg.receiveCall("Oleg");
        System.out.println("Number: " + oleg.getNumber());

        max.receiveCall("Max");
        System.out.println("Number: " + max.getNumber());
    }
}
