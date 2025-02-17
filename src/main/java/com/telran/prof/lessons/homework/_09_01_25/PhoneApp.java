package com.telran.prof.lessons.homework._09_01_25;

public class PhoneApp {

    public static void main(String[] args) {
        ButtonPhone buttonPhone = new ButtonPhone();
        buttonPhone.setPhoneName("Nokia");
        buttonPhone.setOwnNumber("+49 111 444 77");
        buttonPhone.call("0 111 444 77");
        buttonPhone.receiveCall("0 111 444 77");
        System.out.println();

        RadioPhone radioPhone = new RadioPhone();
        radioPhone.setPhoneName("Samsung");
        radioPhone.setOwnNumber("+49 222 555 88");
        radioPhone.call("0 222 555 88");
        radioPhone.receiveCall("0 222 555 88");
        System.out.println();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setPhoneName("Iphone");
        smartPhone.setOwnNumber("+49 333 666 99");
        smartPhone.call("0 333 666 99");
        smartPhone.receiveCall("0 333 666 99");
        System.out.println();

        System.out.println("Using methode:");
        makeCall(buttonPhone, "+49 111 444 77");
        receiveCall(buttonPhone, "+49 111 444 77");
        //Аналогично и для RadioPhone и SmartPhone
    }

    public static void makeCall(Phone phone, String number) {
        phone.call(number);
    }

    public static void receiveCall(Phone phone, String number) {
        phone.receiveCall(number);
    }
}
