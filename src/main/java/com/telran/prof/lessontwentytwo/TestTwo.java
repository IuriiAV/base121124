package com.telran.prof.lessontwentytwo;

public class TestTwo<T> {

    private T obj;  // Object

    private String comment;

    public TestTwo(T obj, String comment) {
        this.obj = obj;
        this.comment = comment;
    }

    public T getObj() { // Object
        return obj;
    }
}
