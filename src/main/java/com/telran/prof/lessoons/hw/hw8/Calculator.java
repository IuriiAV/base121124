package com.telran.prof.lessoons.hw.hw8;

import java.util.Stack;

public class Calculator {

    public String expressionToRPN(String exp) {
        StringBuilder current = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        int priority;
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            priority = getPriority(c);
            if (priority == 0) {
                current.append(c);
            } else if (priority == 1) {
                stack.push(c);
            } else if (priority > 1) {
                while (!stack.isEmpty() && getPriority(stack.peek()) >= priority) {
                    current.append(stack.pop());
                }
                stack.push(c);
            } else if (priority == -1) {
                while (!stack.isEmpty() && getPriority(stack.peek()) != 1) {
                    current.append(stack.pop());
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()) {
            current.append(stack.pop());
        }
        return current.toString();
    }

    public double RPNToAnswer(String RPN) {
        Stack<Double> stack = new Stack<>();

        for (char c : RPN.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push((double) (c - '0'));
            } else {
                double b = stack.pop();
                double a = stack.pop();

                if (c == '+') stack.push(a + b);
                else if (c == '-') stack.push(a - b);
                else if (c == '*') stack.push(a * b);
                else if (c == '/') stack.push(a / b);
            }
        }
        return stack.pop();
    }

    public int getPriority(char c) {
        if (c == '*' || c == '/') {
            return 3;
        } else if (c == '+' || c == '-') {
            return 2;
        } else if (c == '(') {
            return 1;
        } else if (c == ')') {
            return -1;
        } else {
            return 0;
        }
    }
}

