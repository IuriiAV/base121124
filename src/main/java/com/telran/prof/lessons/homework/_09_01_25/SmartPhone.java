package com.telran.prof.lessons.homework._09_01_25;

public class SmartPhone extends Phone{
    private String ownNumber;

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void call(String number) {
        System.out.println("The phone: " + getPhoneName() + " " + ownNumber + " ");
        super.call(number);
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("The phone: " + getPhoneName() + " " + ownNumber + " ");
        super.receiveCall(number);
    }
}
