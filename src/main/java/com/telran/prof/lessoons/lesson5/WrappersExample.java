package com.telran.prof.lessoons.lesson5;

//@SuppressWarnings("") //- подавляет предупреждения компилятора
public class WrappersExample {

    public static void main(String[] args) {
        int a = 10;
        Integer b = a;

        System.out.println( b);
        Integer i = Integer.valueOf(19);
        int c = i; //unboxing
        Integer g = 45;
        //Integer h = new Integer(6); - старая версия иницилизации переменной подобного типа

        Character one = Character.valueOf('f');
        Character two = 'a'; //autoboxing
        char three = one; //unboxing

        String value = "5";
        int i1 = Integer.parseInt(value);
        System.out.println(i1);
    }
}
