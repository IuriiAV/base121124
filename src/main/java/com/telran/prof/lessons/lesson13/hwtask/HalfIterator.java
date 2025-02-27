package com.telran.prof.lessons.lesson13.hwtask;

import java.util.Iterator;
import java.util.List;

public class HalfIterator implements Iterator<HalfIterator> {

    private List<String> strings;

    public HalfIterator(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public HalfIterator next() {
        return null;
    }
}
