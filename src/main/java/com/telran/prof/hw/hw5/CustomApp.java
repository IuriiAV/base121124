package com.telran.prof.hw.hw5;

public class CustomApp {

    public static void main(String[] args) {
        // head : 5 -> 4 -> 7 -> 9 -> 3 -> null

        CustomLinkedList list = new CustomLinkedList();
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(3);
        list.add(8);
        System.out.println(list);
        System.out.println(list.size());
        list.add(8);
        System.out.println(list.size());
        System.out.println(list.get(3));
        System.out.println(list);
        list.remove(10);
        System.out.println(list);
    }
}
