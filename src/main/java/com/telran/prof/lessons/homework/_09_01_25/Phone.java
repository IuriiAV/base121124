package com.telran.prof.lessons.homework._09_01_25;

public abstract class Phone {

    private String phoneName;

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void call(String number) {
        System.out.println("Try to make a call to number: " + number);
    }

    public void receiveCall(String number) {
        System.out.println("Try to receive a call from number: " + number);
    }
}
