package com.telran.prof.lessontwenty;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlerOptionsTwo {

    public static void main(String[] args) {
        try {
            printText();
        } catch (FileNotFoundException e) {
            System.out.println("catch from main method");
        }
    }

    private static void printText() throws FileNotFoundException {
        readFromFile();
    }

    private static String readFromFile() throws FileNotFoundException {
        String path = "Hello";
        FileReader fileReader = new FileReader(path);
        return "Is Ok";
    }
}
