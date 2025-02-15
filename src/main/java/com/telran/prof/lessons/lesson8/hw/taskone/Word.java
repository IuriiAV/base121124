package com.telran.prof.lessons.lesson8.hw.taskone;

public class Word implements Comparable<Word> {

    private String text;

    public Word(String text) {
        this.text = text;
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
