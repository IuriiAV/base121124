package com.telran.prof.lessons.lesson10.queueexample;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        Queue<Integer> integers = new PriorityQueue<>();
        integers.add(1);
        integers.add(5);
        integers.add(3);

        System.out.println(integers.poll());
        System.out.println(integers.poll());
        System.out.println(integers.poll());
    }
}
