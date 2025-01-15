package com.telran.prof.lessons.lesson3.Homework3;

public abstract class Phone {

    private String number;

    private String phoneName;

    private double weight;

    public Phone() {

    }

    public Phone(String number, String phoneName, double weight) {
        this.number = number;
        this.phoneName = phoneName;
        this.weight = weight;
    }

    public void receiveCall(String number) {
        System.out.println("try to receive a call from number " + number);
    }

    public void call(String number) {
        System.out.println("try to make a call to number " + number);
    }

    public String getNumber() {
        return number;
    }

    public void printInfo() {
        System.out.println("Номер: " + number + ", Модель: " + phoneName + ", Вес: " + weight);
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
}
