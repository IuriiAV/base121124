package com.telran.prof.lessonthree.messengerapp;

/**
 * На основе абстрактного класса нельзя создать объект
 * Абстрактный класс - это своего рода шаблон, который показывает как
 * должны выглядеть его классы наследники
 *
 * Абстрактный класс может иметь реализованные методы, которые
 * можно, но не обязательно, переопределить в классах наследниках
 * и может иметь абстрактные методы, которые, обязательно нужно
 * переопределить и реализовать в классах наследниках
 *
 * Если класс абстрактный, то у него могут быть, а могут и не быть
 * абстрактные методы
 *
 * Если в классе есть хотя бы один абстрактный метод, то класс
 * должен быть абстрактным!!
 *
 */
public abstract class Messenger {

    public void sendMessage(String message) {
        System.out.println("Send message " + message);
    }

    public abstract void receiveMessage();
}
