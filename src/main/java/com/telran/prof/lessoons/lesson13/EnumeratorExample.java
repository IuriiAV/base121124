package com.telran.prof.lessoons.lesson13;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorExample {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        System.out.println(vector);

        Enumeration<Integer> elements = vector.elements();
        while (elements.hasMoreElements()){
            System.out.print(elements.nextElement() + " ");
        }
    }
}
