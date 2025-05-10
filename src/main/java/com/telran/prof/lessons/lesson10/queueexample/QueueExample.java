package com.telran.prof.lessons.lesson10.queueexample;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue - FIFO first input, first output
 * Queue - интерфейс, реализующий однонаправленную очередь
 * -> 7 34 5 6 ->
 * Deque - интерфейс, реализующий двунаправленную очередь
 * <-> 7 34 5 6 <->
 * <-> 7 34 5 6
 * Queue -> Deque -> LinkedList
 */
public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
//        System.out.println(queue);
        queue.add(5);
//        System.out.println(queue);
        queue.add(34);
        System.out.println("element in head " + queue.peek());
        queue.poll();
        System.out.println("element in head " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        //add - add element to tail
        //pool - get and remove from head
        //peek - get element from head
    }
}
