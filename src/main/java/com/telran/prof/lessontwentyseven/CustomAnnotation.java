package com.telran.prof.lessontwentyseven;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME) //область видимости аннотации
@Target(value = {ElementType.METHOD, ElementType.FIELD, ElementType.TYPE}) // определяем где она ставится
@Inherited // определяет что аннотация видна в наследниках
public @interface CustomAnnotation {

    String value() default "";
}
