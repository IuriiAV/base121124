package com.telran.prof.lessons.lesson7.singlelinkedlist;

public class SllApp {

    public static void main(String[] args) {
        // head : 5 -> 4 -> 7 -> 9 -> 3 -> null

        Node head = new Node(5);
        Node four = new Node(4);
        Node seven = new Node(7);
        Node nine = new Node(9);
        Node three = new Node(3);
        //5 -> 4
        head.setNext(four);
        four.setNext(seven);
        seven.setNext(nine);
        nine.setNext(three);
        // new Node(5).setNext(new Node(4).setNext(new Node(7)));

        //head
        System.out.println(head);
        System.out.println(head.getNext());
        System.out.println(head.getNext().getNext());
        System.out.println(head.getNext().getNext().getNext());

        Node start = head;
        while (start != null) {
            System.out.print(start + "->");
            start = start.getNext();
        }
    }
}
