package com.telran.base.lesson3;

public class StringExample {

    public static void main(String[] args) {
        String text = "Hello Java!!";
        System.out.println(text);
        System.out.println("Hello Java!!");

        //String - это ссылочный тип данных (строки это объекты),
        //внутри любой строки хранится набор символов
        //String text = "Hello"; 'H','e','l','l','o'
        //строка это массив символов!

        //Строки в джаве неизменяемые
        text = "Hello"; // при любой попытк изменить строку
        //в джаве будет создаваться новая строка
        System.out.println(text);

        //String vs Primitive
        int count = 10; //место в памяти выделяется один раз
        count = 20;     //новое значение записывается в то же самое место
        count = 30;
        count = 50;
        count = 1;

        String one = "Hello!"; //выделяется место в памяти под слово Hello
        one = "Hi!"; // будет выделено новое место в памяти под слово Hi
        one = "Java!";
        one = "Hallo";
        one = "password";
        one = "";
    }
}
