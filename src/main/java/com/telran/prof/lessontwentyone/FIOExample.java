package com.telran.prof.lessontwentyone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;

public class FIOExample {

    public static void main(String[] args) {
        // From + How
        //FileInputStream
        //FileOutputStream
        //FileReader
        //FileWriter

        String path = "/Users/iurii/Downloads/base121124/src/main/java/com/telran/prof/lessontwentyone/test.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            //He->llo : read, read
            while (fileInputStream.available() > 0) {
                byte[] buffer = new byte[12];
                int read = fileInputStream.read(buffer);
                String s = new String(buffer);
                //System.out.print((char) read+"_");
                System.out.println(s);
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
