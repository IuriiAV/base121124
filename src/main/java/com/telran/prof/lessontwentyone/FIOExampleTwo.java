package com.telran.prof.lessontwentyone;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIOExampleTwo {

    public static void main(String[] args) {
        String path = "/Users/iurii/Downloads/base121124/src/main/java/com/telran/prof/lessontwentyone/testOut.txt";
        String text = "Simple text to file";
        try {
            char[] chars = text.toCharArray();
            FileOutputStream fileOutputStream = new FileOutputStream(path);
//            for (char temp : chars) {
//                fileOutputStream.write(temp);
//            }
            fileOutputStream.write(text.getBytes());
            fileOutputStream.close();
            System.out.println("End write to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
