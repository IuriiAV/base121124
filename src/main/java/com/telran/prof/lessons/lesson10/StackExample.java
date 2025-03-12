package com.telran.prof.lessons.lesson10;

import java.util.Stack;

/**
 * Stack -> Vector(ArrayList) -> List (array)
 */

public class StackExample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //push - положить объект сверху стека
        stack.push("I");
        stack.push("am");
        stack.push("Java");
        stack.push("coder");

        System.out.println(stack);

        //peek - посмотреть какой элемент лежит на вершине нашего стека
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        System.out.println("Position element I " + stack.search("I"));
        System.out.println("Position element coder " + stack.search("coder"));

        //pop - взять элемент и извлечь его из стека
        String top = stack.pop();
        System.out.println("Element from top " + top);
        System.out.println("Stack size " + stack.size());
        System.out.println("Element from top " + stack.pop());
        System.out.println("Stack size " + stack.size());
        System.out.println("Element from top " + stack.pop());
        System.out.println("Stack size " + stack.size());
        System.out.println("Element from top " + stack.pop());
        System.out.println("Stack size " + stack.size());
    }
}
