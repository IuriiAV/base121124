package com.telran.prof.lessoons.lesson14.basefunctional;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * Consumer: Метод которого принимает любой параметр и ничего не возвращает
 * method: void accept(param)
 */
public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<Integer> calculator = (a) -> System.out.println( a + 10);
        calculator.accept(34);

        Consumer<String> printer = (name) -> System.out.println("Hello " + name);
        printer.accept("Alex");

        Consumer<Integer> randomizer = (count) -> {
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                System.out.println(random.nextInt(10, 780));
            }
        };
        randomizer.accept(10);

        String param = "Java";
        Consumer<String> printerTwo = (string) -> {
            for (int i = 0; i < string.length(); i++) {
                System.out.println(string.charAt(i));
            }
        };
        printerTwo.accept(param);

        IntConsumer intConsumer = a -> System.out.println(a + 967);
        intConsumer.accept(67);
        //LongConsumer, DoubleConsumer
    }
}
