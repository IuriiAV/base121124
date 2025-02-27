package com.telran.prof.lessonseven.singlelinkedlist;

public class CustomApp {
    public static void main(String[] args) {
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

    }

}
