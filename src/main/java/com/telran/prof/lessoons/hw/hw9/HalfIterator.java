package com.telran.prof.lessoons.hw.hw9;

import java.util.Iterator;
import java.util.List;

public class HalfIterator implements Iterator<String> {

    private final List<String> strings;
    private int index = 0;

    public HalfIterator(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public boolean hasNext() {
        return index < strings.size();
    }

    @Override
    public String next() {
        String string = strings.get(index);
        index += 2;
        return string;
    }
}
