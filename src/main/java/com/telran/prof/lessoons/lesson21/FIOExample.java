package com.telran.prof.lessoons.lesson21;

import java.io.FileInputStream;
import java.io.IOException;

public class FIOExample {

    public static void main(String[] args) {
        //From + How
        //FileInputStream
        //FileOutputStream
        //FileReader
        //FileWriter

        String path = "/Users/kirasubotovskaa/IdeaProjects/base121124/src/main/java/com/telran/prof/lessoons/lesson21/test.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            //->Hello : read
            //H->ello : read
            while (fileInputStream.available() > 0) {
                byte[] buffer = new byte[12];
                //available() - возвращает количество оставшихся элементов в файле
                int read = fileInputStream.read(buffer);
                String s = new String(buffer);
                //System.out.print((char) read);
                System.out.println(s);
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
