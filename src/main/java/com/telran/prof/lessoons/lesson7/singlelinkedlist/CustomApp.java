package com.telran.prof.lessoons.lesson7.singlelinkedlist;

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

        int count = list.size();
        int value = list.get(3);
        list.remove(5);
    }
}
