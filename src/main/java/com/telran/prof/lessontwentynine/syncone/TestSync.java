package com.telran.prof.lessontwentynine.syncone;

public class TestSync implements Runnable {

    /* Синхронизировали потоки по объекту созданному на основании
    класса TestSync
    При запуске приложения, какой то поток будет первым, что дойдет
    до запуска метода run
    Когда он увидит что метод run помечен synchronized он посмотрит
    на монитор объекта что бы понять свободный объект или занят
    Так как этот поток первый, то объект будет свободен и поток начнет
    выполнение метода run (зайдет в синхронизированный метод) при этом
    он пометит мьютекс данного объекта как занят(захватит мьютекс этого объекта)
    До тех пор, пока он будет выполнять синхронизированный метод, мьютекс объекта
    будет занят и освободится только тогда , когда закончится данный метод

    Если в тот момент, когда поток хочет выполнить синхронизированный метод,
    но мьютекс этого объекта занят(те другой поток его выполняет) , то поток
    который хотел с ним работать, переходит в блокированное состояние до тех пор
    пока мьютекс этого объекта не освободится и он сможет продолжить работу с этим
    методом
     */

//    @Override
//    public void run() {
//        SyncApp.counter++;
//       // System.out.println(Thread.currentThread().getName() + " push like");
//
//    }

    @Override
    public synchronized void run() { // synchronized in method === synchronized (this)
        System.out.println(Thread.currentThread().getName() + " start run");
        for (int i = 0; i < 100; i++) {
          //  synchronized (this) {
                SyncApp.counter++; // 1.read 2.inc 3.write
          //  }
            //System.out.println(Thread.currentThread().getName() + "-" + SyncApp.counter);
            pause(50);
        }
        System.out.println(Thread.currentThread().getName() + " stop run");
        pause(10);
    }

    private void pause(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
