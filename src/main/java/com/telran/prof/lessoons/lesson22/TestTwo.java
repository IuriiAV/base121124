package com.telran.prof.lessoons.lesson22;

public class TestTwo<T> {

    private T obj; // Object[]

    private String comment;

    public TestTwo(T obj, String comment) {
        this.obj = obj;
        this.comment = comment;
    }

    public T getObj() { // Object[]
        return obj;
    }
}
