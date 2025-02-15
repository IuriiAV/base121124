package com.telran.prof.lessonseven.singlelinkedlist;

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

    //TODO
    public int size() {
        return 0;
    }

    //TODO index 0 to end, if size == 10, get (100) ????
    public int get(int index) {
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
