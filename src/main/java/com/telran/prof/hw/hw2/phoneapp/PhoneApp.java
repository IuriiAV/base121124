package com.telran.prof.hw.hw2.phoneapp;

public class PhoneApp {

    public static void main(String[] args) {
        ButtonPhone buttonPhone = new ButtonPhone();
        buttonPhone.setPhoneName("ButtonPhone");
        buttonPhone.setOwnNumber("777-777-888");
        RadioPhone radioPhone = new RadioPhone();
        radioPhone.setPhoneName("RadioPhone");
        radioPhone.setOwnNumber("662-677-898");
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setPhoneName("SmartPhone");
        smartPhone.setOwnNumber("898-999-444");
        Phone[] phones = {radioPhone, smartPhone, buttonPhone};

        for (Phone phone : phones) {
            phone.call("788 899 677");
            phone.receiveCall("788 555 677");
            System.out.println(" ");
        }

        makeCall(buttonPhone, buttonPhone.getOwnNumber());
        makeCall(radioPhone, radioPhone.getOwnNumber());
        makeCall(smartPhone, smartPhone.getOwnNumber());

        receiveCall(buttonPhone, buttonPhone.getOwnNumber());
        receiveCall(radioPhone, radioPhone.getOwnNumber());
        receiveCall(smartPhone, smartPhone.getOwnNumber());
    }

    public static void makeCall(Phone phone, String number) {
        System.out.println("The phone " + phone.getPhoneName() + " try to make a call to number " + number);
    }

    public static void receiveCall(Phone phone, String number) {
        System.out.println("The phone " + phone.getPhoneName() + " try to receive a call to number " + number);
    }
}
