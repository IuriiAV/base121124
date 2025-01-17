package com.telran.homeworkprof.H1.task2;

/**
 *  * 2.Класс Phone.
 *  * Создайте класс Phone, который содержит переменные number, model и weight.
 *  * Создайте три экземпляра этого класса.
 *  * Выведите на консоль значения их переменных.
 *  * Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
 *  * Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
 *  * Вызвать эти методы для каждого из объектов.
 **/
public class Phone {

    private String number;

    private String model;

    private int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void recieveCall(String nameWhoCalls) {
        System.out.println("Calling " + nameWhoCalls);
    }

    public String getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("+49324598294", "Samsung", 180);
        Phone phone2 = new Phone("+49249944922", "Xiaomi", 200);
        Phone phone3 = new Phone("+49929950029", "Iphone", 170);

        Phone[] phones = {phone1, phone2, phone3};
        for (Phone phone : phones) {
            System.out.println("We have " + phone.model + " with number " + phone.number + " which has weight " + phone.weight);
            System.out.println("Phone number that we get " + phone.getNumber());
            phone.recieveCall("Petro");
            System.out.println("-------------------");
        }
    }
}
