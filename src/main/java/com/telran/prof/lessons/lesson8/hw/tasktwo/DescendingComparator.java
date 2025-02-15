package com.telran.prof.lessons.lesson8.hw.tasktwo;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}
