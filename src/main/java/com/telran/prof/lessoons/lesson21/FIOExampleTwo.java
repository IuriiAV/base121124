package com.telran.prof.lessoons.lesson21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIOExampleTwo {

    public static void main(String[] args) {
        String path = "/Users/kirasubotovskaa/IdeaProjects/base121124/src/main/java/com/telran/prof/lessoons/lesson21/testout.txt";
        String text = "Simple text to file";
        try {
            char[] charArray = text.toCharArray();
            FileOutputStream fileOutputStream = new FileOutputStream(path);
//            for(char temp : charArray) {
//                fileOutputStream.write(temp);
//            }
            fileOutputStream.write(text.getBytes());
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
