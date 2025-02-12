package com.telran.prof.lessoons.lesson10;

import java.util.Stack;

/**
 * Stack - LIFO last input, first output
 * Stack -> Vector(ArrayList) -> List (array)
 */

public class StackExample {

    /*
       |     |
       |coder|
       | Java|
       |  am |
       |__I__|
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

        System.out.println("Position I " + stack.search("I"));
        System.out.println("Position coder " + stack.search("coder"));

        //pop - взять элемент с вершины стека и извлечь его из стека
        String top = stack.pop();
        System.out.println("Element from top " + top);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Element from top " + stack.pop());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Element from top " + stack.pop());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Element from top " + stack.pop());
        System.out.println("Stack size: " + stack.size());


    }
}
