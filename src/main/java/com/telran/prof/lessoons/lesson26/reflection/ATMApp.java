package com.telran.prof.lessoons.lesson26.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ATMApp {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        //ATM atm = new ATM();
        //atm.putMoney("Alex" , 500);

        //Создание объекта через reflection api
        ATM atm = ATM.class.getConstructor().newInstance();

        //У любого объекта можно получить класс на основе которого он создан
        Class cls = atm.getClass();

        System.out.println(cls.getName());

        //У любого класса можно получить массив его методов
        Method[] methods = cls.getMethods();
        Method[] declaredMethods = cls.getDeclaredMethods();
        for(Method method : declaredMethods) {
            System.out.println(method.getName());
        }

        //У любого класса можно получить массив его полей(даже приватных)
        Field[] declaredFields = cls.getDeclaredFields();
        for(Field field : declaredFields) {
            System.out.println(field.getName());
        }

        //По имени поля, у любого класса можно получить само поле
        Field field = cls.getDeclaredField("mainAccount");
        System.out.println(field);

        //Если поле приватное, то можно разрешить доступ к нему на чтение и запись
        field.setAccessible(true);
        //В выбранное поле, можно установить нужное значение у конкретного объекта
        field.set(atm, "TR 3333 4444 5555 6666");

        atm.putMoney("Oleg", 800);

        Method innerTransfer = cls.getDeclaredMethod("innerTransfer", String.class);
        System.out.println(innerTransfer);
        innerTransfer.setAccessible(true);
        innerTransfer.invoke(atm, "FR 5555 4444 3333 2222");

        Method putMoney = cls.getDeclaredMethod("putMoney", String.class, int.class);
        putMoney.invoke(atm, "Max", 600);
    }
}
