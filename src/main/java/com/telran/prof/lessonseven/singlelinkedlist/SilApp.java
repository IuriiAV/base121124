package com.telran.prof.lessonseven.singlelinkedlist;

public class SilApp {

    public static void main(String[] args) {

        Node head = new Node(5);
        Node four = new Node(4);
        Node seven = new Node(7);
        Node nine = new Node(9);
        Node three = new Node(3);

        head.setNext(four);
        four.setNext(seven);
        seven.setNext(nine);
        nine.setNext(three);

        System.out.println(head);
        System.out.println(head.getNext());
        System.out.println(head.getNext().getNext());
        System.out.println(head.getNext().getNext().getNext());

        Node start = head;
        while (start != null){
            System.out.print(start + "->");
            start = start.getNext();
        }

    }


}
