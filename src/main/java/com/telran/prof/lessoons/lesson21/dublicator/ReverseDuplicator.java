package com.telran.prof.lessoons.lesson21.dublicator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Stack;

public class ReverseDuplicator implements Duplicator{

    @Override
    public void duplicate(String from, String to) {
        Stack<Integer> stack = new Stack<>();
        try{
            FileInputStream fileInputStream = new FileInputStream(from);
            FileOutputStream fileOutputStream = new FileOutputStream(to);
            while (fileInputStream.available() > 0) {
                stack.push(fileInputStream.read());
            }
            while (!stack.isEmpty()) {
                fileOutputStream.write(stack.pop());
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException exception) {
            System.out.println("Cannot copy file from " + from + "\n to " + to);
        }
    }
}
