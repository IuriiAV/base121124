package com.telran.prof.lessons.lesson10;

import java.util.Stack;

public class TaskStackExampleTwo {

    public static void main(String[] args) {
        //kfeefbcaddac -> kffbcaac -> kbcc -> kb
        String text = "kfeefbcaddac";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i); //k f e e f
            if (stack.isEmpty()) {
                stack.push(temp); //k
            } else {
                if (temp != stack.peek()) {
                    stack.push(temp); //f e -> k b c a d
                } else {
                    stack.pop(); //k f -> k -> k b c a ->k b c -> kb
                }
            }
        }
        System.out.println(stack);
    }
}
