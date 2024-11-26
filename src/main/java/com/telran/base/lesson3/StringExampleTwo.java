package com.telran.base.lesson3;

public class StringExampleTwo {

    public static void main(String[] args) {
        String text = "Hello";
        //Длина строки
        System.out.println(text);
        //Вызов метода, который сообщит длину строки
        //text.length()
        //Вызов метода вычисляющего длину строки и присвоение результата
        //в переменную textLength
        int textLength = text.length();
        System.out.println("Text length = " + textLength);

        //Метод получения символа из строки по номеру(индекс)
        //номер называется индекс
        //символы в строке нумеруются с 0
        //первый символ хранится под номером 0, последний под номером n-1,
        //где n - длина строки
        //Hello - H-0, e-1, l-2, l-3, o-4
        //charAt(index)
        char symbol = text.charAt(0);
        System.out.println("Symbol by 0 index = " + symbol);

        char symbolEnd = text.charAt(4);
        System.out.println("Symbol by 4 index = " + symbolEnd);
        //System.out.println("Symbol by 4 index = " + text.charAt(4));

        //char symbolIncorrect = text.charAt(10);

        System.out.println("Bye!!");
    }
}
