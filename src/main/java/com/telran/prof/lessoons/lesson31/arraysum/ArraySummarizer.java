package com.telran.prof.lessoons.lesson31.arraysum;

public class ArraySummarizer implements Runnable {

    private final int[] array;

    private final int start;

    private final int end;

//    private final int[] result;
//
//    private final int index;

    private Result resultTwo;

    public ArraySummarizer(int[] array, int start, int end, Result resultTwo) {
        this.array = array;
        this.start = start;
        this.end = end;
//        this.result = result;
//        this.index = index;
        this.resultTwo = resultTwo;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        //result[index] = sum;
        synchronized (resultTwo) {
            resultTwo.setResult(resultTwo.getResult() + sum);
        }

//        synchronized (SumApp.class) {
//            SumApp.resultSum += sum;
//        }
    }
}
