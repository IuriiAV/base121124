package com.telran.prof.lessons.lesson18;

/**
 * Многопоточность - это свойство платформы или операционной системы или виртуальной машины или
 * приложения, который говорит о том, что некий процесс операционной системы состоит внутри себя из
 * нескольких потоков, которые работают параллельно
 *
 * Процесс - экземпляр выполняемого прилажения, которым выделены независимые ресурсы - процессорное
 * время и память
 * Когда мы запускаем какое либо приложение, то одному экземпляру данного приложения,
 * соответствует строго один процесс!!!
 *
 * Поток - это базовая единица выполнения программы(кода)
 * По умолчанию один процесс состоит из одного потока - и этот поток называется главным потоком приложения,
 * в Java о называется "main".
 * Один процесс может состоять из более цем 1 потока, в Джава главный поток приложения может
 * порождать другие потоеи и они будут работать параллельно
 *
 * Thread - основной класс для работы с потоком в джава
 *
 * ->main -> Thread - 0
 *        -> Thread - 1
 *        -> Thread - 2
 *
 * Для создания потока нужно (вариант 1)
 * 1) от наследоваться от класса Thread
 * 2) переопределить метод run
 * 3) код который, будет выполнятся в отдельном потоке
 * 4) запускаем объект с методом run в отдельном потоке
 *
 * Для создания потока нужно (вариант 2)
 * 1) Имплементировать интерфейс Runnable
 * 2) переопределить метод run
 * 3) код который, будет выполнятся в отдельном потоке
 * 4) запускаем объект с методом run в отдельном потоке
 *
 * Поток main - это главный поток нашего приложения, все остальные потоки создаются из
 * потока main, все остальные потоки, создаваемые из потока main,
 * это дочерние потоки main, а поток main является их родителем
 *
 * Поток main не может завершить свою работу, до тех пор пока не закончили работу все его дочерни потоки
 */
public class MthAppExample {

    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println("Method main: Current thread name is: " + name);

        Printer printer = new Printer();
        //printer.run();

        Thread thread = new Thread(printer);
        thread.start(); // запуск нового потока который будет выполнять код
        // написанный в методе run, объекта, который передан в конструктор

        printGreetingsPeriodically();
        System.out.println("End method main");
        //Thread.currentThread().join(printGreetingsPeriodically())

    }

    private static void printGreetingsPeriodically(){
        String name = Thread.currentThread().getName();
        int count = 0;
        while (true){
            System.out.println("Hello from "+ name + " thread, count = " + count++);

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
