package com.telran.base.lesson10;

/**
 * Строка это ссылочный тип данных - это некий объект в оперативной памяти
 * Строка это не изменяемый объект, изменить созданную строку нельзя
 * При попытке что-то добавить к существующей строке - будет создана новая строка в
 * оперативной памяти
 */
public class StringExample {

    public static void main(String[] args) {
        String text = "Hello Java!";
        String[] strings = {"Hello", "problem one", "result one", "error", "result"};

        String answer = getAnswer(strings);
        System.out.println(answer);

        String one = "Hello One";  //"Hello One"
        one = one + "Two"; // "Hello OneTwo"
    }

    private static String getAnswer(String[] strings) {
        String answer = "";
        for (int i = 0; i < strings.length; i++) {
            answer = answer + " " + strings[i];
        }

        return answer;
        //Сами того не зная, внутри цикла мы создали 5 различных строк(объектов) в памяти
        // ""
        // " Hello"
        // " Hello problem one"
        // " Hello problem one result one"
        // " Hello problem one result one error"
        // " Hello problem one result one error result"
    }
}
