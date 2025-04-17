package com.telran.prof.hw.hw1;

public class PhoneApp {

    public static void main(String[] args) {
        Phone phoneOne = new Phone("555505000", "Apple", 1.62);
        Phone phoneTwo = new Phone("333303003", "Samsung", 2.30);
        Phone phoneThree = new Phone("404444400", "Apple", 1.30);

        Phone[] phones = {phoneOne, phoneTwo, phoneThree};

        for (Phone phone : phones) {
            phone.printInfo();
        }

        System.out.println();

        for (Phone phone : phones) {
            System.out.println(phone.getNumber());
        }

        System.out.println();

        phoneOne.receiveCall("Alex");
        phoneTwo.receiveCall("David");
        phoneThree.receiveCall("Mark");
    }
}
