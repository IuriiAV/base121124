package com.telran.prof.lessons.lesson3.Homework3;

public class PhoneApp {

    public static void main(String[] args) {
        ButtonPhone buttonPhone = new ButtonPhone();
        RadioPhone radioPhone = new RadioPhone();
        SmartPhone smartPhone = new SmartPhone();

        buttonPhone.setPhoneName("ButtonPhone");
        buttonPhone.setOwnNumber("123-456-789");
        radioPhone.setPhoneName("RadioPhone");
        radioPhone.setOwnNumber("231-456-789");
        smartPhone.setPhoneName("SmartPhone");
        smartPhone.setOwnNumber("132-456-789");


        buttonPhone.call("111-222");
        buttonPhone.receiveCall("333-444");
        System.out.println();
        radioPhone.call("111-222");
        radioPhone.receiveCall("333-444");
        System.out.println();
        smartPhone.call("111-222");
        smartPhone.receiveCall("333-444");
        System.out.println();

        makeCall(buttonPhone, "123-456");
        makeCall(radioPhone, "321-234-7453");
        makeCall(smartPhone, "643-235-2345");

        receiveCall(buttonPhone, "123-456");
        receiveCall(radioPhone, "321-234-7453");
        receiveCall(smartPhone, "643-235-2345");
    }

    public static void makeCall(Phone phoneName, String number){
        phoneName.call(number);
    }

    public static void receiveCall(Phone phoneName, String number){
        phoneName.receiveCall(number);
    }
}
