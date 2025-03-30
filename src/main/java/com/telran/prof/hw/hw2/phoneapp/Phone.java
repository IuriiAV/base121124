package com.telran.prof.hw.hw2.phoneapp;

public abstract class Phone {

    private String phoneName;

    public Phone() {
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void call(String number) {
        System.out.println("Try to make a call to number " + number);
    }

    public void receiveCall(String number) {
        System.out.println("Try to receive a call from number " + number);
    }
}
