package com.telran.prof.lessonnine;

public class HashCodeExample {

    public static void main(String[] args) {
        String a = "A";
        System.out.println(a.hashCode());
        System.out.println("B".hashCode());
        System.out.println("AB".hashCode());
        System.out.println("SDFDFSDFBS".hashCode());

        System.out.println("E".hashCode());
        System.out.println("e".hashCode());
        System.out.println(new Integer(5).hashCode());
    }
}
