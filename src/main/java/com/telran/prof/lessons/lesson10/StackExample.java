package com.telran.prof.lessons.lesson10;

/**
 * Stack - LIFO last input first output
 * Stack -> Vector (ArrayList -> List (array)
 */

import java.util.Stack;

public class StackExample {

    /**
     * | _coder_ |
     * | _Java_  |
     * |  _am_   |
     * |____I____|
     */

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //push - положить объект на вершину стека
        stack.push("I");
        stack.push("am");
        stack.push("Java");
        stack.push("coder");
        System.out.println(stack);

        //peek - посмотреть какой элемент лежит на вершине нашего стека
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        //pop - взять элемент с вершины стека и извлечь его из стека
        String top = stack.pop();
        System.out.println("Element From top: " + top);
        System.out.println(stack.peek());
    }
}
