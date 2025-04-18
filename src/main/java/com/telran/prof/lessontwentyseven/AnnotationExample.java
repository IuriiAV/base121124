package com.telran.prof.lessontwentyseven;

import lombok.Getter;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Аннотации это форма метаинформации, они не являются частью программы
 *
 * Аннотации имеют разную область видимости
 */

@Getter
@CustomAnnotation
public class AnnotationExample {

    @CustomAnnotation(value = "Hello")
    private String text;

    @CustomAnnotation
    public static void main(String[] args) throws Exception{
        //@Override - помечаем переопределенный метод(Compile +, ByteCode -, Runtime-)
        //@FunctionalInterface - помечает что интерфейс является функциональным
        // (Compile +, ByteCode +, Runtime + )
        //@Deprecated - говорит о том, что метод не нужно больше использовать

        new Integer(5);

        ExampleTwo exampleTwo = new ExampleTwo();
        exampleTwo.print();

        Class cls = ExampleTwo.class;
        System.out.println(Arrays.toString(cls.getDeclaredMethods()));
        Method print = cls.getDeclaredMethod("print");
        System.out.println("Has override ? " + print.isAnnotationPresent(Override.class));

        boolean result = cls.isAnnotationPresent(CustomAnnotation.class);
        System.out.println("Example two has CustomAnnotation " + result);

        Class interf = InterfaceExample.class;
        boolean annotationPresent = interf.isAnnotationPresent(FunctionalInterface.class);
        System.out.println("Has interface functional ? " + annotationPresent);
    }

    public void print() {
        System.out.println("Hello");
    }
}
