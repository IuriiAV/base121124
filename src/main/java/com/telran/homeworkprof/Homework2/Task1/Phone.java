package com.telran.homeworkprof.Homework2.Task1;

public abstract class Phone  {

    private String phoneName ;

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void call(String phoneNumber) {
        System.out.println("try to make a call to number: " + phoneNumber);
    }

    public void receiveCall(String phoneNumber) {
        System.out.println("try to receive a call from number: " + phoneNumber);
    }

    public static void makeCallFromAnyPhone(Phone phone, String phoneNumber){
        phone.call(phoneNumber);
    }

    public static void receiveCallAnAnyPhone(Phone phone , String phoneNumber){
        phone.receiveCall(phoneNumber);
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setPhoneName("Samsung");
        smartPhone.setOwnNumber("326361886461");
        smartPhone.call("123456789");
        smartPhone.receiveCall("987654321");


        System.out.println(" ");

        RadioPhone radioPhone = new RadioPhone();
        radioPhone.setPhoneName("Iphone");
        radioPhone.setOwnNumber("436326125");
        radioPhone.call("987654321");
        radioPhone.receiveCall("12345689");

        System.out.println(" ");

        ButtonPhone buttonPhone = new ButtonPhone();
        buttonPhone.setPhoneName("Nokia");
        buttonPhone.setOwnNumber("754466426");
        buttonPhone.call("777888999");
        buttonPhone.receiveCall("444555666");

        System.out.println(" ");

        makeCallFromAnyPhone(smartPhone , "4577557");
        receiveCallAnAnyPhone(buttonPhone , "4577557");
    }
}
