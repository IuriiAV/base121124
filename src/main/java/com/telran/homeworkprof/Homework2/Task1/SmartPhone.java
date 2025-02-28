package com.telran.homeworkprof.Homework2.Task1;

public class SmartPhone extends Phone{

    private String ownNumber;

    public String getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void call(String phoneNumber) {
        System.out.print("The phone " + getPhoneName() + " with ownNumber " + ownNumber + " ");
        super.call(phoneNumber);
    }

    @Override
    public void receiveCall(String phoneNumber) {
        System.out.print("The phone " + getPhoneName() + " with ownNumber " + ownNumber + " " );
        super.receiveCall(phoneNumber);
    }
}
