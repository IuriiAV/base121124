package com.telran.prof.lessontwentysix.reflection.example;

import java.lang.reflect.Method;

public class JunitApp {

    public static void main(String[] args) throws Exception {
        // создать объект TestExample
        // получить все возможные его методы
        // запустить данный метод с несколькими
        //параметрами Hello, Java, SQL

        TestExample test = TestExample.class.getConstructor().newInstance();

        Method[] declaredMethods = test.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            boolean annotationPresent = method.isAnnotationPresent(CustomTest.class);
            if (annotationPresent) {
                CustomTest customTest = method.getDeclaredAnnotation(CustomTest.class);
                if (customTest.isNeedToTest()) {
                    String[] params = customTest.params();
                    for (String param : params) {
                        method.invoke(test, param);
                    }
                }
            }
        }
    }
}
