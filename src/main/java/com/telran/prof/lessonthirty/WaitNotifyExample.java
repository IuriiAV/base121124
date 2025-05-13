package com.telran.prof.lessonthirty;

import java.util.ArrayList;
import java.util.List;
public class WaitNotifyExample {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();

        ReaderThread readerThread = new ReaderThread(list);
        WriterThread writerThread = new WriterThread(list);

        Thread one = new Thread(readerThread);
        Thread two = new Thread(writerThread);

        one.start();
        two.start();

        Thread.sleep(30000);

        System.out.println("Reader state " + one.getState());
        System.out.println("Writer state " + two.getState());
    }
}
