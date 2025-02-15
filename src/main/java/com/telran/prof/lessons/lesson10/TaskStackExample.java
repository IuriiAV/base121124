package com.telran.prof.lessons.lesson10;

import java.util.Stack;

public class TaskStackExample {

    public static void main(String[] args) {
        String text = "Hello Java World!";
        System.out.println(reverse(text));

    }

    private static String reverse(String string){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char temp = string.charAt(i);
            stack.push(temp);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
