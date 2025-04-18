package com.telran.prof.lessontwentyeight.stopflag;

public class MusicPlayerAdvanced implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("________________ play music _________");
            if (!StopApp.isEnable) {
                break;
            }
        }
    }
}
