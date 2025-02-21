package com.telran.prof.lessons.homework._07_01_25.phone;

public class Phone {
    private String number;
    private String model;
    private String weight;

    public Phone(String number, String model, String weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    public String getNumber() {
        return number;
    }

    public void printInfo() {
        System.out.println("Номер: " + number + "Модель: " + model + "Вес: " + weight);
    }
}
