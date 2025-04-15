package com.telran.prof.lessoons.lessson27;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@CustomPrint(text = "Hello Class")
public class Task {

    @CustomPrint(text = "Hello field")
    private String exampleOne;

    private String exampleTwo;

    @CustomPrint(text = "Hello method")
    public static void print() {
    }

    public static void print2() {
    }

    public static void main(String[] args) {
        Class<Task> cls = Task.class;

        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(CustomPrint.class)) {
                System.out.println(method.getDeclaredAnnotation(CustomPrint.class).text());
            }
        }

        Field[] declaredFields = cls.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(CustomPrint.class)) {
                System.out.println(field.getDeclaredAnnotation(CustomPrint.class).text());
            }
        }

        System.out.println(cls.getDeclaredAnnotation(CustomPrint.class).text());
    }
}
