package com.telran.prof.lessoons.lesson26.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CustomTest {

    boolean isNeedToTest() default true;

    String[] params() default {};
}
