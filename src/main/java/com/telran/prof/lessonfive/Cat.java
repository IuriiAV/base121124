package com.telran.prof.lessonfive;

public class Cat {

    private int age = 10; // heap

    private String name = "Alex"; // heap

    public void method() {
        int height = 15; // stack
        Cat cat = new Cat();  // cat - stack , new Cat - heap
    }
}
