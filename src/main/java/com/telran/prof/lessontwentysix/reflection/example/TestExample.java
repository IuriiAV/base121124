package com.telran.prof.lessontwentysix.reflection.example;

public class TestExample {

    @CustomTest(isNeedToTest = true, params = {"Hello", "Java", "SQL"})
    void testReverse(String text) {
        System.out.println(new StringBuilder(text).reverse());
    }

    void reverse() {
        System.out.println("HELLO HELLO");
    }
}
