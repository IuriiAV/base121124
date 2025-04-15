package com.telran.prof.lessoons.lessson27;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Аннотации это форма метаинформации, они не являются частью программы
 *
 * Аннотации имеет разную область видимости
 */
@CustomAnnotation
public class AnnotationExample {

    @CustomAnnotation(value = "Hello")
    private String text;

    @CustomAnnotation
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException {
        //Override - помечаем переопределенный метод(Compile+, Bytecode-, Runtime-)
        //@FunctionalInterface - помечает что интерфейс является функциональным(Compile+, Bytecode+, Runtime+)
        //@Deprecated - говорит о том, что метод или класс не нужно больше использовать

        new ExampleTwo().print();

        Class cls = ExampleTwo.class;
        System.out.println(Arrays.toString(cls.getDeclaredMethods()));
        Method print = cls.getDeclaredMethod("print");
        System.out.println("Has override? " + print.isAnnotationPresent(Override.class));

        boolean result = cls.isAnnotationPresent(CustomAnnotation.class);
        System.out.println("Example two has CustomAnnotation? " + result);

        Class interf = InterfaceExample.class;
        boolean annotationPresent = interf.isAnnotationPresent(FunctionalInterface.class);
        System.out.println("Has interface functional? " + annotationPresent);
    }

    public void print() {
        System.out.println("Hello");
    }
}
