package com.telran.base.lesson10;

/**
 * StringBuilder - нужен для того что бы работать с изменениями в строке,
 * добавлять к строке, удалять из строки, заменять что-то в строке
 * без создания каждый раз новой строки после каждого действия
 *
 * Внутри строки лежит массив байт
 * Внутри StringBuilder тоже массив, когда мы добавляем что-то к строке
 * мы добавляем это в массив
 */
public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ");
        sb.append("Java");
        sb.append(" ").append(" class!!").append(" Ok!");
        sb.delete(3, 6);
        sb.reverse();
        String result = sb.toString();
        System.out.println(result);

        String[] strings = {"Hello", "problem one", "result one", "error", "result"};

        String answer = getAnswer(strings);
        System.out.println(answer);

        String name = "Alex";
        System.out.println("Hello " + name);
    }

    private static String getAnswer(String[] strings) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
             answer.append(strings[i]).append(" ");
        }

        return answer.toString();
    }
}
