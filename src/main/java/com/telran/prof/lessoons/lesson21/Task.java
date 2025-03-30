package com.telran.prof.lessoons.lesson21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Создать файл story.txt c небольшой историей из 3х строк
 * Считать этой файл побайтово
 * И сделать из каждого считанного байта -символ
 * (StringBuilder)
 * а из всех символов сделать строку и вывести ее один раз в консоль
 *
 */

public class Task {

    public static void main(String[] args) {
        String path = "/Users/kirasubotovskaa/IdeaProjects/base121124/src/main/java/com/telran/prof/lessoons/lesson21/story.txt";
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            while (fileInputStream.available() > 0) {
                int read = fileInputStream.read();
                sb.append((char) read);
            }
            fileInputStream.close();
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
