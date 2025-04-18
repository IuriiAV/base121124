package com.telran.prof.lessoons.lesson28.task;

public class Counter implements Runnable{

    private final int step;

    private static boolean stopApp = false;

    @Override
    public void run() {
            for (int i = 0; i <= 1000; i += step) {
                System.out.println(Thread.currentThread().getName() + ": " + i);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(!TaskApp.isEnable) {
                    break;
                }
            }
            if(TaskApp.isEnable) {
                TaskApp.isEnable = false;
            }


    }

    public Counter(int step) {
        this.step = step;
    }
}
