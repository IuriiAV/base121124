package com.telran.prof.lessoons.lessson27;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME) //Область видимости аннотации
@Target(value = {ElementType.METHOD, ElementType.FIELD, ElementType.TYPE}) //Определяем где она ставится
@Inherited //Определяет что аннотация видна в наследовании
public @interface CustomAnnotation {

    String value() default "";
}
