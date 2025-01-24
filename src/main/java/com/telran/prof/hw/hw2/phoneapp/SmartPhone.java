package com.telran.prof.hw.hw2.phoneapp;

public class SmartPhone extends Phone {

    private String ownNumber;

    public String getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void call(String number) {
        System.out.println("The phone " + getPhoneName() + " " + ownNumber + " ");
        super.call(number);
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("The phone " + getPhoneName() + " " + ownNumber + " ");
        super.receiveCall(number);
    }
}
