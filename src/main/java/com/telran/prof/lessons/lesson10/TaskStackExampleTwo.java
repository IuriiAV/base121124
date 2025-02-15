package com.telran.prof.lessons.lesson10;

import java.util.Calendar;
import java.util.Stack;

public class TaskStackExampleTwo {

    public static void main(String[] args) {
        //kfeefbcaddac -> kffbcaac -> kbcc -> kb
        String text = "kfeefbcaddac";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            if (stack.isEmpty()){
                stack.push(temp);
            } else {
                if (temp != stack.peek()){
                    stack.push(temp);
                }else {
                    stack.pop();
                }
            }
        }
        System.out.println(stack);
    }
}
