package com.telran.prof.lessoons.lesson28.stopflag;

public class MusicPlayerAdvanced implements Runnable{
    @Override
    public void run() {
        while (StopApp.isEnable) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("____________ play music ___________");
//            if(!StopApp.isEnable) {
//                break;
//            }
        }
    }
}
