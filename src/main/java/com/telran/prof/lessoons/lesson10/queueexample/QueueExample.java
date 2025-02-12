package com.telran.prof.lessoons.lesson10.queueexample;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue - FIFO first input, first output
 * Queue - интерфейс, реализующий однонаправленную очередь
 * -> 7 34 5 6 ->
 * Deque - интерфейс, реализующий двунаправленную очередь
 * <-> 7 34 5 6 <->
 * <-> 7 34 5 6
 * Queue -> Dequeue -> LinkedList
 */

public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(5);
        queue.add(34);
        queue.add(7);
        System.out.println("Element in head " + queue.peek());
        queue.poll();
        System.out.println("Element in head " + queue.peek());
        while (!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }
        System.out.println(queue.peek());
        //add - add element
        //poll - get and remove from head
        //peek - get element from head
    }
}
