package com.telran.base.lesson4;

public class Task {

    public static void main(String[] args) {
        int min = 20;
        int max = 50;
        //Math.random()*(max-min+1)+min
        int i = (max - min + 1);
        double random = Math.random();

        System.out.println("i = " + i);
        System.out.println("random = " + random);
        double doubleResult = random * i + min;
        System.out.println(doubleResult);

        //(int) - явное приведение типа
        int result = (int) doubleResult;
        System.out.println(result);

//        for(int j = 0; j < 100; j++) {
//            System.out.println(Math.random() * i + min);
//        }
    }
}
