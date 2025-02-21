package com.telran.prof.lessons.lesson9;

public class HashCodeExample {

    public static void main(String[] args) {
        String a = "A";
        System.out.println(a.hashCode());
        System.out.println("A".hashCode());
        System.out.println("a".hashCode());
    }
}
