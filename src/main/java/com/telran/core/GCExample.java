package com.telran.core;

/**
 * Memory in Java :
 * STACK :
 *
 * HEAP  :
 *      Young generation: Все новые объекты создаются здесь
 *            Eden (S0)(когда эта область заполняется, запускается Minor GC и
 *            все выжившие объекты, переносятся в Survivor)
 *            Survivor (S1) (когда это заполнится, то те кто выжил поедут в Old Generation)
 *
 *      Old Generation : Объекты, которые долго живут
 *      сюда помещаются объекты из Young Generation, после того
 *      как выживают после нескольких циклов сборки мусора
 *
 *      Metaspace : хранятся метаданные классов и методов
 *
 *  Minor GC - Young generation(выполняется очень часто и быстро)
 *
 *  Major GC - Old generation(трудоемкая операция и выполняется реже, при этом
 *  приложение в этот момент может останавливаться)
 *
 *  Stop-The-World пауза - момент когда останавливаются все потоки
 *
 *  Виды GC :
 *  1) Serial GC - самый примитивный и простой - когда он работает, ничего больше не работает
 *  2) Parallel GC - эффективен в многопроцессорных системах (могут быть длительные  Stop-The-World)
 *  3) CMS GC
 *  4) G1 GC (Garbage-First) - эффективен в управлении памятью( разделяет и приоритизирует регионы памяти)
 *  (короткая пауза Stop-The-World) (default)
 *  5) Z GC - работает с кучей мелких регионов памяти, сборка происходит быстрее и паузы меньше, фрагаментирует
 *  память
 *  6) Shenandoah - аналог ZGC - только он работает параллельно с приложением и эффективно
 *
 *  -Xms - мин размер кучи
 *  -Xmx - макс размер кучи
 *  -XX:+UseG1GC - указание GC для использования
 */
public class GCExample {

    private int count = 0;

    public GCExample(int count) {
        this.count = count;
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1000000; i++) {
            new GCExample(i);
            //System.out.println(i);
        }

        //метод рекомендует сборщику мусора запуститься
        System.gc();

        Thread.sleep(10000);
    }

    @Override
    protected void finalize() throws Throwable {
       // System.out.println("Object is collected " + count );
    }
}
