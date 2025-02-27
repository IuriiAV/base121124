package com.telran.prof.lessonseven.singlelinkedlist;

public class CustomLinkedList {
    private Node head;

    public CustomLinkedList() {
        this.head = null;
    }

    public void add(int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
            return;
        }
            Node current = head;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(node);

    }
    //TODO
    public int size(){
        return 0;
    }
    //TODO index 0 to end , if size == 100 , get 100 ???

    public int get(int insex){
        return 0;
    }
    //TODO * size , index >= size???
    public void remove (int index){

    }


    @Override
    public String toString() {
        StringBuilder sd =  new StringBuilder();
        sd.append("[");
        Node current = head;
        while (current != null){
            int value = current.getValue();
            sd.append(value);
            if (current.getNext() != null){
                sd.append(", ");
            }
            current = current.getNext();
        }
        sd.append("]");
        return sd.toString();
    }
}
