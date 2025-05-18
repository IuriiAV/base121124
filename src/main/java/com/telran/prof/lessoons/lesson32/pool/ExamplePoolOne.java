package com.telran.prof.lessoons.lesson32.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExamplePoolOne {

    public static void main(String[] args) throws Exception{
        ExecutorService executorsService = Executors.newSingleThreadExecutor();

        Calculator calculator = new Calculator(0);
        executorsService.execute(calculator);

        CalculatorTwo calculatorTwo = new CalculatorTwo();
        Future<String> submit = executorsService.submit(calculatorTwo);
        String s = submit.get();
        System.out.println(s);

        for (int i = 0; i < 10; i++) {
            executorsService.execute(new Calculator(i));
        }

        executorsService.shutdown(); //прекращает работу пуллов
    }
}
