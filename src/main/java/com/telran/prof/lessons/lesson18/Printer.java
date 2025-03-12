package com.telran.prof.lessons.lesson18;

public class Printer extends Thread{

    @Override
    public void run(){
        int count = 0 ;
        String name = Thread.currentThread().getName();
        while (true){
            System.out.println("Hello from " + name + " thread count " + count++);

            //Pause in current Thread
            try{
                Thread.sleep(5000); // pause 5 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Pause in current Thread
        }
    }

}
