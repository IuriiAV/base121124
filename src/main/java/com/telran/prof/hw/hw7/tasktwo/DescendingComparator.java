package com.telran.prof.hw.hw7.tasktwo;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return (a - b) * -1;
    }
}
