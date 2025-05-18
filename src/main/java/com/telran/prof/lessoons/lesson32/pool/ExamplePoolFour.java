package com.telran.prof.lessoons.lesson32.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExamplePoolFour {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        for (int i = 0; i < 12; i++) {
            //scheduledExecutorService.scheduleAtFixedRate(new Calculator(i), i+10,1, TimeUnit.SECONDS);
            scheduledExecutorService.scheduleWithFixedDelay(new Calculator(i), 1, 10, TimeUnit.SECONDS);
        }

        scheduledExecutorService.shutdown();
    }
}
