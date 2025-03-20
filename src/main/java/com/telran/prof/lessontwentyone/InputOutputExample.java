package com.telran.prof.lessontwentyone;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputOutputExample {

    public static void main(String[] args) {
        //InputStream - побайтовое чтение данных
        InputStream in = System.in;
        try {
            while (true) {
                byte[] buffer = new byte[10];
                int data = in.read(buffer);
                System.out.println("From console = " + Arrays.toString(buffer));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
