package com.telran.practice;

public class CustomList {

    private MyNode first;

    public CustomList(MyNode first) {
        this.first = first;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        MyNode current = first;
        while (current != null) {
            if(current != first) {
                sb.append(", ");
            }
            sb.append(current.getValue());
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
