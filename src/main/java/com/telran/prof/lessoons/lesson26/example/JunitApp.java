package com.telran.prof.lessoons.lesson26.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JunitApp {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        TestExample testExample = TestExample.class.getConstructor().newInstance();
        Class clsTest = testExample.getClass();
        Method[] declaredMethods = clsTest.getDeclaredMethods();

        for (Method method : declaredMethods) {
            boolean annotationPresent = method.isAnnotationPresent(CustomTest.class);
            if (annotationPresent) {
                CustomTest declaredAnnotation = method.getDeclaredAnnotation(CustomTest.class);
                String[] params = declaredAnnotation.params();
                if (declaredAnnotation.isNeedToTest()) {
                    for (String param : params) {
                        method.invoke(testExample, param);
                    }
                }
            }
        }
    }
}
