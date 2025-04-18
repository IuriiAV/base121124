package com.telran.prof.lessoons.lesson28.daemon;

public class MusicPlayer implements Runnable{
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("____________ play music ___________");
        }
    }
}
