package com.telran.prof.lessons.lesson7.singlelinkedlist;

public class CustomLinkedList {

    private Node head;

    public CustomLinkedList() {
        this.head = null;
    }

    public void add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return;
        }

        // head : 5 -> 4 -> 7 -> 9 -> 3 -> null
        // add(8)
        // head : 5 -> 4 -> 7 -> 9 -> 3 -> 8 -> null
        Node current = head; // 5

        while (current.getNext() != null) {
            current = current.getNext(); // 4 7 9
        }
        current.setNext(node); // 3 -> 8
    }

    public void size() {
        int count = 1;
        Node node = new Node(head.getValue());

        Node current = head; // 5

        while (current.getNext() != null) {
            current = current.getNext(); // 4 7 9
            count++;
        }
        current.setNext(node); // 3 -> 8
        System.out.println("Длина данных = " + count);
    }

    //TODO index 0 to end, if size == 10, get (100) ????
    public int get(int index) {
        Node node = new Node(head.getValue());

        Node current = head; // 5
        int count = 0;
        System.out.print("[");
        while (current.getNext() != null) {

            current = current.getNext(); // 4 7 9
            System.out.print(count + " ");
            count++;
        }
        System.out.println("]");
        current.setNext(node);// 3 -> 8
        return 0;
    }

    //TODO *  size, index >= size ???
    public void remove(int index) {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node current = head;
        while (current != null) {
            int value = current.getValue();
            sb.append(value);
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }

        sb.append("]");
        return sb.toString();
    }
}
