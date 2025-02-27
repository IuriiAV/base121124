package com.telran.prof.lessons.lesson14.basefunctional;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/**
 * Consumer : Метод которого принимает любой параметр и ничего не возвращает
 * mhetod : void accept(param)
 */
public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<Integer> calculator = (a) -> System.out.println(a + 10);
        calculator.accept(5);

        Consumer<String> printer = (name) -> System.out.println("Hallo " + name);
        printer.accept("Alex");

        Consumer<Integer> randomizer = (count) -> {
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                System.out.println(random.nextInt());
            }
        };
        randomizer.accept(10);

        String param = "Java";
        Consumer<String> stringChar = (paramChar) -> {
            for (int i = 0; i < paramChar.length(); i++) {
                System.out.println(paramChar.charAt(i));
            }
        };
        stringChar.accept(param);

        IntConsumer intConsumer = a -> System.out.println(a);
        intConsumer.accept(10);
        //LongConsumer, DoubleConsumer
    }
}
