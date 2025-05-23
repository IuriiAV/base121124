package com.telran.prof.lessoneighteen.mthexamplethree;

public class ThreadExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Start method run in thread " + Thread.currentThread().getName());

        //Pause in current Thread
        try {
            Thread.sleep(15000); // pause 5 sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Pause in current Thread

        System.out.println("End method run in thread " + Thread.currentThread().getName());
    }
}
