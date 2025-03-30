package com.telran.prof.lessons.lessons16;

import java.util.Arrays;
import java.util.List;

/**
 * BigBen, bigBob, Big, Ben, Big Bob
 */
public class Task {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("BigBen","BigBob","Big","Ben","Big Bob");

        long big = list.stream()
                .filter(s -> s.startsWith("Big"))
                .count();
        System.out.println(big);
    }
}
