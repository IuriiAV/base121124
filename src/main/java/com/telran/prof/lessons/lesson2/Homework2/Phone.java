package com.telran.prof.lessons.lesson2.Homework2;

public class Phone {

    private String number;

    private String model;

    private double weight;

    public Phone() {

    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }

    public void printInfo(){
        System.out.println("Номер: " + number + ", Модель: " + model + ", Вес: " + weight);
    }
}
