package com.telran.prof.hw.hw7.taskone;

public class Word implements Comparable<Word>{

    private String text;

    public Word(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public int compareTo(Word other) {
        return this.text.length() - other.text.length();
    }

    @Override
    public String toString() {
        return text;
    }
}
