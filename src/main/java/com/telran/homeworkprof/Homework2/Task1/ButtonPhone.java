package com.telran.homeworkprof.Homework2.Task1;

public class ButtonPhone extends Phone{

    private String ownNumber;

    public String getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    public void call(String phoneNumber){
        System.out.println("the phone" + getPhoneName() +" "+ getOwnNumber()+" " + phoneNumber );
    }
}
