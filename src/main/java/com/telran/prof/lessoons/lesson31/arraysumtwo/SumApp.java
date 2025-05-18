package com.telran.prof.lessoons.lesson31.arraysumtwo;

import com.telran.prof.lessoons.lesson31.arraysum.Result;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class SumApp {

    public static void main(String[] args) throws Exception{
        int[] array = new int[100_000_000];
        Random random = new Random();
        int controlSum = 0;
        for (int i = 0; i < array.length; i++) {
            int value = random.nextInt(1, 5);
            array[i] = value;
            controlSum += value;
        }

        ArraySummarizer summarizerOne = new ArraySummarizer(array, 0, 25_000_000);
        ArraySummarizer summarizerTwo = new ArraySummarizer(array, 25_000_000, 50_000_000);
        ArraySummarizer summarizerThree = new ArraySummarizer(array, 50_000_000, 75_000_000);
        ArraySummarizer summarizerFour = new ArraySummarizer(array, 75_000_000, 100_000_000);

        FutureTask<Integer> taskOne = new FutureTask<>(summarizerOne);
        Thread threadOne = new Thread(taskOne);

//        try {
//            //если на момент вызова метода get,поток уже завершил работу, то
//            //мы получим его результат
//            //А если поток еще не завершил работу, то поток, который вызвал метод get
//            //уйдет в состояние ожидания, до тех пор, пока не будет получен результат
//            Integer sum = taskOne.get();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

        FutureTask<Integer> taskTwo = new FutureTask<>(summarizerTwo);
        Thread threadTwo = new Thread(taskTwo);
        
        FutureTask<Integer> taskThree = new FutureTask<>(summarizerThree);
        Thread threadThree = new Thread(taskThree);
        
        FutureTask<Integer> taskFour = new FutureTask<>(summarizerFour);
        Thread threadFour = new Thread(taskFour);

        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();

        Integer resultOne = taskOne.get();
        Integer resultTwo = taskTwo.get();
        Integer resultThree = taskThree.get();
        Integer resultFour = taskFour.get();

        System.out.println("Control sum = " + controlSum);
        System.out.println("Sum = " + (resultOne + resultTwo + resultThree + resultFour));


    }
}
