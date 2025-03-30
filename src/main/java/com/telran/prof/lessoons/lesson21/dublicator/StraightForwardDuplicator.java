package com.telran.prof.lessoons.lesson21.dublicator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StraightForwardDuplicator implements Duplicator{

    @Override
    public void duplicate(String from, String to) {
        try{
            FileInputStream fileInputStream = new FileInputStream(from);
            FileOutputStream fileOutputStream = new FileOutputStream(to);
            while (fileInputStream.available() > 0) {
                fileOutputStream.write(fileInputStream.read());
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException exception) {
            System.out.println("Cannot copy file from " + from + "\n to " + to);
        }
    }
}
