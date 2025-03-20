package com.telran.prof.lessontwentyone.duplicator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Stack;

/**
 * Все что считали, поместить в структуру LIFO
 * что бы записать это в файл в обратном порядке
 */
public class ReverseDuplicator implements Duplicator {

    @Override
    public void duplicate(String from, String to) {
        try {
            FileInputStream fileInputStream = new FileInputStream(from);
            FileOutputStream fileOutputStream = new FileOutputStream(to);

            Stack<Integer> stack = new Stack<>();
            while (fileInputStream.available() > 0) {
                int read = fileInputStream.read();
                stack.push(read);
            }

            while (!stack.isEmpty()) {
                int pop = stack.pop();
                fileOutputStream.write(pop);
            }

            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException exception) {
            System.out.println("Cannot copy file from " + from + "\n to " + to);
        }
    }
}
