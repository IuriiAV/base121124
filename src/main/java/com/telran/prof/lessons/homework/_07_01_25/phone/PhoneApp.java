package com.telran.prof.lessons.homework._07_01_25.phone;

public class PhoneApp {

    public static void main(String[] args) {
        Phone Alex = new Phone("49 111 444 77; ", "Nokia; ", "0.390g");
        Phone Maria = new Phone("49 222 555 88; ", "Samsung; ", "0.280g");
        Phone Anton = new Phone("47 333 666 99; ", "Iphone; ", "0.260g");
        Alex.printInfo();
        Maria.printInfo();
        Anton.printInfo();
        System.out.println();

        Alex.receiveCall("Alex");
        System.out.println("Номер: " + Alex.getNumber());
        System.out.println();

        Maria.receiveCall("Maria");
        System.out.println("Звонит: " + Maria.getNumber());
        System.out.println();

        Anton.receiveCall("Anton");
        System.out.println("Звонит: " + Anton.getNumber());
    }
}
