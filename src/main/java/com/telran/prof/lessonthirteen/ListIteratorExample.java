package com.telran.prof.lessonthirteen;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        //System.out.println(list);
        ListIterator<Integer> iterator = list.listIterator();

        int count = 0;
        while (iterator.hasNext() && count < 5 ) {
            System.out.print(iterator.next() + " ");
            count++;
        }
        System.out.println();

        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }
}
